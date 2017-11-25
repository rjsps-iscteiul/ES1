package pt.iscte.es1.project.resources.msg;

import java.util.ArrayList;

public class Mensagem {
	
	
	private String id;
	private ArrayList<String> rules;
	private Boolean spam;  
	
	public Mensagem(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> getRules() {
		return rules;
	}

	public void setRules(ArrayList<String> rules) {
		this.rules = rules;
	}

	public Boolean getSpam() {
		return spam;
	}

	public void setSpam(Boolean spam) {
		this.spam = spam;
	}
}
