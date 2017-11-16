package pt.iscte.es1.project.utils;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Search files from the windows explorer
 * 
 * @author smmoa
 *
 */

public class SearchFile extends JPanel{
	
	private static final long serialVersionUID = 1773555809906973302L;
	private JTextField link = new JTextField();
	private JButton button = new JButton("Open C:\\");
	
    public SearchFile() {
    	setLayout(new BorderLayout());
    	button.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent arg0) {
    			try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					System.err.println("ERRO Windows Look");
					e.printStackTrace();
				}
    			JFileChooser chooser = new JFileChooser();
    			int status = chooser.showOpenDialog(null);
    			if (status == JFileChooser.APPROVE_OPTION) {
    				File file = chooser.getSelectedFile();
    				if (file == null) {
    					return;
    				}
    				link.setText(file.getAbsolutePath());

    			}
    			
    		}
    	});
        add(link, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);
    }

	public JTextField getLink() {
		return link;
	}
    
}