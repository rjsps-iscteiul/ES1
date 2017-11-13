package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

//public abstract class FalsosGUI extends JFrame{
public class FalsosGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5240224811001438094L;
	
	private JTable tabela = new JTable();
	private JButton avaliar = new JButton("Avaliar");
	private JButton guardar = new JButton("Guardar");
	private JLabel fake_neg_label = new JLabel("Falsos Negativos");
	private JTextField fake_neg = new JTextField();
	private JLabel fake_pos_label = new JLabel("Falsos Positivos");
	private JTextField fake_pos = new JTextField();
	
	public FalsosGUI() {
		buildGUI();
	}

	protected void buildGUI() {
		setLayout(new BorderLayout());
		setSize(300, 400);
		setResizable(false);
		
		JPanel table = new JPanel();
		table.add(tabela);
		
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
	
	public static void main(String[] args) {
		new FalsosGUI().open();
	}

}