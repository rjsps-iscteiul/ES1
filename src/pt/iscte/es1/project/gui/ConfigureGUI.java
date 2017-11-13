package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import pt.iscte.es1.project.gui.GUI;
import pt.iscte.es1.project.utils.SearchFile;

public class ConfigureGUI extends GUI{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9149707610120461378L;

	public ConfigureGUI(String s) {
		super(s);
	}

	@Override
	protected void buildGUI() {
		setSize(600, 200);
		setResizable(false);
		
		add(new JLabel("Directórios dos ficheiros:", SwingConstants.LEFT), BorderLayout.NORTH);
		
		JPanel center = new JPanel(new BorderLayout());
		center.setBorder(new BevelBorder(BevelBorder.RAISED)); 
		
		JPanel buttons = new JPanel(new GridLayout(0,1)); 
		buttons.setBorder(new EmptyBorder(10,0,10,0));
		JButton auto = new JButton("<html> Configuração <br> Automática </html>");
		JButton manual = new JButton("<html> Configuração <br> Manual </html>");
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
//		add(gui);

	}
	
}