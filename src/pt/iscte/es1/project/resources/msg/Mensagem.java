package pt.iscte.es1.project.resources.msg;

import java.util.ArrayList;

/**
 * Message structure to store in memory the e-mail messages loaded 
 * @author ruijs
 *
 */
public class Mensagem {

	private String id;
	private ArrayList<String> rules;
	private Boolean spam;  
	
	/**
	 * Default Constructor 
	 */
	public Mensagem(){}

	/**
	 * Getter for the message identifier 
	 * @return id is the id of the message
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter for the message identifier
	 * @param id is the ID to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Getter for the rules associated to that message
	 * @return rules is an ArrayList of rules 
	 */
	public ArrayList<String> getRules() {
		return rules;
	}

	/**
	 * Setter for the rules associated to a message 
	 * @param rules is the ArrayList of rules to set 
	 */
	public void setRules(ArrayList<String> rules) {
		this.rules = rules;
	}

	/**
	 * Getter for the boolean identifier to know if the messages were loaded from the spam or the ham log 
	 * @return spam is true if the message is from de spam file or false if the message is from the ham file 
	 */
	public Boolean getSpam() {
		return spam;
	}

	/**
	 * Setter for the booelan spam identifier of the message 
	 * @param spam
	 */
	public void setSpam(Boolean spam) {
		this.spam = spam;
	}
}
