package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import pt.iscte.es1.project.gui.GUI;
import pt.iscte.es1.project.utils.SearchFile;

/**
 * Creation of the window to select files to configure
 * @author smmoa
 *
 */

public class ConfigureGUI extends GUI{

	private static final long serialVersionUID = -9149707610120461378L;
	private JButton auto;
	private JButton manual;
	
	/**
	 * Constructor
	 * @param s
	 */
	public ConfigureGUI(String s) {
		super(s);
	}
	
	/**
	 * Method that creates the window look
	 */
	@Override
	protected void buildGUI() {
		setSize(600, 200);
		setResizable(false);
		
		add(new JLabel("Directoria dos ficheiros:", SwingConstants.LEFT), BorderLayout.NORTH);
		
		JPanel center = new JPanel(new BorderLayout());
		center.setBorder(new BevelBorder(BevelBorder.RAISED)); 
		
		JPanel buttons = new JPanel(new GridLayout(0,1)); 
		buttons.setBorder(new EmptyBorder(10,0,10,0));
		
		auto = new JButton("<html> Configuração Automática </html>");
		manual = new JButton("<html> Configuração Manual </html>");
		
		buttons.add(auto);
		buttons.add(manual);

		JPanel direct = new JPanel(new GridLayout(0,1)); 
		direct.setBorder(new EmptyBorder(0,10,10,20));
		JLabel ruleslabel = new JLabel("Rules File:");
		SearchFile rules = new SearchFile();
		JLabel hamlabel = new JLabel("Ham File:");
		SearchFile ham = new SearchFile();
		JLabel spamlabel = new JLabel("Spam File:");
		SearchFile spam = new SearchFile();
		direct.add(ruleslabel);
		direct.add(rules);
		direct.add(hamlabel);
		direct.add(ham);
		direct.add(spamlabel);
		direct.add(spam);
		
		center.add(direct, BorderLayout.CENTER);
		center.add(buttons, BorderLayout.EAST);
		add(center);

		auto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Escolheu a Configuração Automática. \n" + "Foi carreado o ficheiro de regras que se encontra em: " + rules.getLink().getText());
				FalsosGUI automaticGUI = new FalsosAuto("Configuração Automática", rules.getLink().getText(), ham.getLink().getText(), spam.getLink().getText());
				automaticGUI.open();
				dispose();
				
			}
		});;
		
		manual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Escolheu a Configuração Manual. \n" + "Foi carreado o ficheiro de regras que se encontra em: " + rules.getLink().getText());
				FalsosGUI manualGUI = new FalsosManual("Configuração Manual", rules.getLink().getText(), ham.getLink().getText(), spam.getLink().getText());
				manualGUI.open();
				dispose();
			}
		});

	}
	
	public JButton getButtonAuto() {
		return auto;
	}
	
	public JButton getButtonManual() {
		return manual;
	}
	
}