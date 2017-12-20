package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAIIBuilder;
import org.uma.jmetal.operator.impl.crossover.SBXCrossover;
import org.uma.jmetal.operator.impl.mutation.PolynomialMutation;
import org.uma.jmetal.qualityindicator.impl.hypervolume.PISAHypervolume;
import org.uma.jmetal.solution.DoubleSolution;
import org.uma.jmetal.util.experiment.Experiment;
import org.uma.jmetal.util.experiment.ExperimentBuilder;
import org.uma.jmetal.util.experiment.component.ComputeQualityIndicators;
import org.uma.jmetal.util.experiment.component.ExecuteAlgorithms;
import org.uma.jmetal.util.experiment.component.GenerateBoxplotsWithR;
import org.uma.jmetal.util.experiment.component.GenerateLatexTablesWithStatistics;
import org.uma.jmetal.util.experiment.component.GenerateReferenceParetoSetAndFrontFromDoubleSolutions;
import org.uma.jmetal.util.experiment.util.ExperimentAlgorithm;
import org.uma.jmetal.util.experiment.util.ExperimentProblem;

import antiSpamFilter.AntiSpamFilterProblem;
import pt.iscte.es1.project.resources.msg.Mensagem;
import pt.iscte.es1.project.utils.ReadFile;


/**
 * Creation of the window to configure and evaluate
 * @author smmoa
 * @author ruijs
 * @author rdsas
 */

//public abstract class FalsosGUI extends JFrame{
public class FalsosGUI extends JFrame{

	private static final long serialVersionUID = 5240224811001438094L;

	private JTable tabela;
	private JButton avaliar = new JButton("Avaliar");
	private JButton guardar = new JButton("Guardar");
	private JLabel fake_neg_label = new JLabel("Falsos Negativos", SwingConstants.CENTER);
	private JTextField fake_neg = new JTextField();
	private JLabel fake_pos_label = new JLabel("Falsos Positivos", SwingConstants.CENTER);
	private JTextField fake_pos = new JTextField();
	private ArrayList<String> rules ;

	private String rules_path;
//	private String ham_path;
//	private String spam_path;
	private ArrayList<Mensagem> hamList = new ArrayList<Mensagem>();
	private ArrayList<Mensagem> spamList = new ArrayList<Mensagem>();

	protected boolean manual ;

	protected boolean priorEvaluation;
	private static final int INDEPENDENT_RUNS = 5 ;

	/**
	 * Constructor
	 */
	public FalsosGUI(){
		buildGUI();
	}

	/**
	 * Constructor
	 * @param title
	 * @param rules_path
	 * @param ham_path
	 * @param spam_path
	 */
	public FalsosGUI(String title, String rules_path, String ham_path, String spam_path) {
		setTitle(title);
		setRules_path(rules_path);
		hamList = ReadFile.messageReader(ham_path);
		spamList = ReadFile.messageReader(spam_path);
		buildGUI();
	}

	/**
	 * Method that creates the window look
	 */
	protected void buildGUI() {
		priorEvaluation=false;
		setLayout(new BorderLayout());
		setSize(400, 400);
		setResizable(false);

		JPanel downpanel = new JPanel();
		downpanel.setLayout(new GridLayout(0,1));

		JPanel buttons = new JPanel();
		buttons.add(avaliar);
		avaliar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Avaliação em progresso...");
				if(!manual) {
					avaliarAutomatico();
				}
				else if(manual) {
					avaliarManual();
				}

			}
		});
		buttons.add(guardar);
		guardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(priorEvaluation)
					guardarResultados();
				else {
					System.out.println("Necessita realizar a avaliação da configuração antes de a poder guardar");
					return ;
				}

			}

		});
		JPanel results = new JPanel();
		results.setLayout(new GridLayout(2,0));
		results.add(fake_neg_label);
		results.add(fake_neg);
		results.add(fake_pos_label);
		results.add(fake_pos);
		results.setBorder(new EmptyBorder(0,0,10,20));

		downpanel.add(buttons);
		downpanel.add(results);

		JScrollPane table = buildTable();
		table.setBorder(new EmptyBorder(10,20,10,0));

		add(table, BorderLayout.CENTER);
		add(downpanel, BorderLayout.SOUTH);

	}

//	public JButton getButtonAvaliar() {
//		return avaliar;
//	}
//	
//	public JButton getButtonGuardar() {
//		return guardar;
//	}
	
	/**
	 * Method that saves the results
	 */
	public void guardarResultados() {

		double[] pesos = new double[rules.size()];
		for(int i = 0 ; i<rules.size() ; i++) {
			if(tabela.getValueAt(i, 1)!=null) {
				if(Double.parseDouble(tabela.getValueAt(i, 1).toString()) <= 5  || Double.parseDouble(tabela.getValueAt(i, 1).toString()) >= -5)
					pesos[i]= Double.parseDouble(tabela.getValueAt(i, 1).toString());	
				else 
					pesos[i]=0;	
			}
		}
		ReadFile.guardarConfig(rules , pesos);	
	}

	/**
	 * Method that does the manual evaluation
	 */
	public void avaliarManual() {
		double[] pesos = new double[rules.size()];
		double[] falsosPositivosNegativos = new double[2];
		boolean dadosinvalidos = false;
		try{
			for(int i = 0 ; i < rules.size() ; i++) {
				if(tabela.getValueAt(i, 1) != null) {
					if(Double.parseDouble(tabela.getValueAt(i, 1).toString()) <= 5  || Double.parseDouble(tabela.getValueAt(i, 1).toString()) >= -5)
						pesos[i] = Double.parseDouble(tabela.getValueAt(i, 1).toString());	
					else dadosinvalidos = true;
				} else {
					pesos[i] = 0;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Peso(s) com valores inválidos");
		}
		if(dadosinvalidos) {
			System.out.println("Peso(s) com valores inválidos");
			return ;
		}

		falsosPositivosNegativos = evaluate(transformIntoHashMap(pesos));
		updateFalsosGui(falsosPositivosNegativos);
		priorEvaluation = true;
	}

	public void open() {
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Sets the local variable rules_path to the path given to the method
	 * @param rules_path
	 */
	public void setRules_path(String rules_path) {
		this.rules_path = rules_path;
	}


	/**
	 * Creates a JScrollPane including a table with the rules from the file specified in the previous screen
	 * @return table is a JScrollPane 
	 */
	public JScrollPane buildTable() {

		JScrollPane table = new JScrollPane();

		rules = ReadFile.rulesReader(rules_path);
		String[] tableColumns = new String[] {"Regras", "Pesos"};
		String[][] tableData = new String[rules.size()][2];

		for(int i = 0; i < rules.size(); i++){
			tableData[i][0] = rules.get(i);
		}

		tabela = new JTable(new DefaultTableModel(tableData, tableColumns));

		table.add(tabela);
		table.setViewportView(tabela);

		return table;
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		new FalsosGUI().open();
	}

	/**
	 * Method that transforms into HashMap
	 * @param pesos
	 * @return hash
	 */
	public HashMap<String, Double> transformIntoHashMap(double[] pesos){
		HashMap<String,Double> hash = new HashMap<String,Double>();
		for(int i = 0 ; i < pesos.length;i++) {
			hash.put(rules.get(i), pesos[i]);
		}
		return hash;
	}

	/**
	 * Method that evaluates the weights
	 * @param regrasComPesos
	 * @return falsosPositivosNegativos
	 */
	public double[] evaluate(HashMap<String,Double> regrasComPesos) {
		double falsosPositivos = 0;
		double falsosNegativos = 0;
		for(Mensagem spam : spamList) {
			double pesoFinalMensagem = getPesoFinalMensagem(regrasComPesos, spam);
			if(pesoFinalMensagem <= 5) {
				falsosNegativos++;
			}
		}

		for(Mensagem ham : hamList) {
			double pesoFinalMensagem = getPesoFinalMensagem(regrasComPesos, ham);
			if(pesoFinalMensagem > 5) {
				falsosPositivos++;
			}
		}

		double[] falsosPositivosNegativos= new double[2] ;
		falsosPositivosNegativos[0] = falsosPositivos;
		falsosPositivosNegativos[1] = falsosNegativos;

		return falsosPositivosNegativos;
	}

	/**
	 * Method that gets the final weight of the message
	 * @param regrasComPesos
	 * @param mensagem
	 * @return pesoFinal
	 */
	public double getPesoFinalMensagem(HashMap<String,Double> regrasComPesos , Mensagem mensagem) {
		double pesoFinal = 0;
		for(String regra  : mensagem.getRules()) {
			if(regrasComPesos.containsKey(regra))
				pesoFinal+= regrasComPesos.get(regra);	
		}
		return pesoFinal;
	}


	/**
	 * Method that evaluates the automatic version
	 */
	public void avaliarAutomatico() {
		String experimentBaseDirectory = "experimentBaseDirectory";

		List<ExperimentProblem<DoubleSolution>> problemList = new ArrayList<>();
		problemList.add(new ExperimentProblem<>(new AntiSpamFilterProblem(this)));

		List<ExperimentAlgorithm<DoubleSolution, List<DoubleSolution>>> algorithmList =
				configureAlgorithmList(problemList);

		Experiment<DoubleSolution, List<DoubleSolution>> experiment =
				new ExperimentBuilder<DoubleSolution, List<DoubleSolution>>("AntiSpamStudy")
				.setAlgorithmList(algorithmList)
				.setProblemList(problemList)
				.setExperimentBaseDirectory(experimentBaseDirectory)
				.setOutputParetoFrontFileName("FUN")
				.setOutputParetoSetFileName("VAR")
				.setReferenceFrontDirectory(experimentBaseDirectory+"/referenceFronts")
				.setIndicatorList(Arrays.asList(new PISAHypervolume<DoubleSolution>()))
				.setIndependentRuns(INDEPENDENT_RUNS)
				.setNumberOfCores(4)
				.build();

		new ExecuteAlgorithms<>(experiment).run();
		try {
			new GenerateReferenceParetoSetAndFrontFromDoubleSolutions(experiment).run();
			new ComputeQualityIndicators<>(experiment).run() ;
			new GenerateLatexTablesWithStatistics(experiment).run() ;
			new GenerateBoxplotsWithR<>(experiment).setRows(1).setColumns(1).run() ;
		} catch (IOException e) {
			e.printStackTrace();
		}

		double[] resultadoFinal = ReadFile.fpfnReader();
		double[] pesos = ReadFile.pesosReader(resultadoFinal[2], rules.size());
		updateTablePesos(pesos);

		updateFalsosGui(resultadoFinal);
		priorEvaluation = true;
	}

	/**
	 * Method that updates the table
	 * @param pesos
	 */
	private void updateTablePesos(double [] pesos) {
		for(int i = 0 ; i < rules.size() ; i++) {
			tabela.setValueAt(pesos[i], i, 1);
		}
	}

	/**
	 * Method that updates the positive and negative fakes
	 * @param falsosPositivosNegativos
	 * @return algorithms
	 */
	private void updateFalsosGui(double[] falsosPositivosNegativos) {
		fake_pos.setText(String.valueOf(Math.round(falsosPositivosNegativos[0])));
		fake_neg.setText(String.valueOf(Math.round(falsosPositivosNegativos[1])));
	}

	/**
	 * Method that configures the algorithm list
	 * @param problemList
	 * @return algorithms
	 */
	static List<ExperimentAlgorithm<DoubleSolution, List<DoubleSolution>>> configureAlgorithmList(
			List<ExperimentProblem<DoubleSolution>> problemList) {
		List<ExperimentAlgorithm<DoubleSolution, List<DoubleSolution>>> algorithms = new ArrayList<>();

		for (int i = 0; i < problemList.size(); i++) {
			Algorithm<List<DoubleSolution>> algorithm = new NSGAIIBuilder<>(
					problemList.get(i).getProblem(),
					new SBXCrossover(1.0, 5),
					new PolynomialMutation(1.0 / problemList.get(i).getProblem().getNumberOfVariables(), 10.0))
					.setMaxEvaluations(500)
					.setPopulationSize(100)
					.build();
			algorithms.add(new ExperimentAlgorithm<>(algorithm, "NSGAII", problemList.get(i).getTag()));
		}

		return algorithms;
	}
}