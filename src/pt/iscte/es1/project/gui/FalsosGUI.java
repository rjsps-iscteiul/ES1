package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import pt.iscte.es1.project.utils.ReadFile;

//public abstract class FalsosGUI extends JFrame{
public class FalsosGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5240224811001438094L;
	
	private JTable tabela;
	private JButton avaliar = new JButton("Avaliar");
	private JButton guardar = new JButton("Guardar");
	private JLabel fake_neg_label = new JLabel("Falsos Negativos", SwingConstants.CENTER);
	private JTextField fake_neg = new JTextField();
	private JLabel fake_pos_label = new JLabel("Falsos Positivos", SwingConstants.CENTER);
	private JTextField fake_pos = new JTextField();
	
	private String rules_path;
	private String ham_path;
	private String spam_path;
	
	public FalsosGUI(){
		buildGUI();
	}
	
	public FalsosGUI(String title, String rules_path, String ham_path, String spam_path) {
		setTitle(title);
		setRules_path(rules_path);
		buildGUI();
	}

	protected void buildGUI() {
		
		setLayout(new BorderLayout());
		setSize(400, 400);
		setResizable(false);
		
		JScrollPane table = new JScrollPane();
		
		ArrayList <String> rules = ReadFile.rulesReader(rules_path);
		String[] tableColumns = new String[] {"Regras", "Pesos"};
		String[][] tableData = new String[rules.size()][2];
		
		for(int i = 0; i < rules.size(); i++){
			tableData[i][0] = rules.get(i);
		}
		
		tabela = new JTable(new DefaultTableModel(tableData, tableColumns));
//		tabela.setDefaultEditor(tabela.getColumnClass(0), null);	//make non editable fields in table
		
		table.add(tabela);
		table.setViewportView(tabela);

		
		JPanel downpanel = new JPanel();
		downpanel.setLayout(new GridLayout(0,1));
		
		JPanel buttons = new JPanel();
		buttons.add(avaliar);
		buttons.add(guardar);
		
		JPanel results = new JPanel();
		results.setLayout(new GridLayout(2,0));
		results.add(fake_neg_label);
		results.add(fake_neg);
		results.add(fake_pos_label);
		results.add(fake_pos);
		
		downpanel.add(buttons);
		downpanel.add(results);
		
		add(table, BorderLayout.CENTER);
		add(downpanel, BorderLayout.SOUTH);
		
		
	}

	public void open() {
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public void setRules_path(String rules_path) {
		this.rules_path = rules_path;
	}
	

	public static void main(String[] args) {
		new FalsosGUI().open();
	}

}