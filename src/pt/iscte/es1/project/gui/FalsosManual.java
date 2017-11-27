package pt.iscte.es1.project.gui;

public class FalsosManual extends FalsosGUI{

	public FalsosManual(String title, String rules_path, String ham_path, String spam_path) {
		super(title, rules_path, ham_path, spam_path);
		manual=true;
	}
	
}
