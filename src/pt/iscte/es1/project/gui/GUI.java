package pt.iscte.es1.project.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.border.*; 

/**
 * Creation of the welcome window
 * @author smmoa
 *
 */

public class GUI extends JFrame{

	private static final long serialVersionUID = -2354561480505194562L;
	
/**
 * Constructor
 * @param s
 */
	public GUI (String s) {
		setTitle(s);
		buildGUI();
	}
	
/**
 * Method that creates the window look
 */
	protected void buildGUI() {
		setSize(600, 180);
		setResizable(false);
		JPanel gui = new JPanel(new BorderLayout()); 
		gui.setBorder(new BevelBorder(BevelBorder.RAISED)); 
		
		JPanel north = new JPanel(new GridLayout(0,1)); 
		north.add(new JLabel("Configurar filtragem anti-spam para Professional Mailbox", SwingConstants.CENTER)); 
		gui.add(north);
		
		JPanel south = new JPanel(new GridLayout(0,1)); 
		south.setBorder(new EmptyBorder(0,80,20,80));		
		JButton init = new JButton("Iniciar");
		init.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Configuração Anti-Spam iniciada!");
				ConfigureGUI newframe = new ConfigureGUI("Configurar Anti-Spam para Professional Mailbox");
				newframe.open();
				newframe.setLocationRelativeTo(null);
				dispose();
			}
		});
		south.add(init);
		gui.add(south, BorderLayout.SOUTH);
		
		add(gui);
	}

	public void open() {
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
