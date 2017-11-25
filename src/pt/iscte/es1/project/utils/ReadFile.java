package pt.iscte.es1.project.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pt.iscte.es1.project.resources.msg.Mensagem;

/**
 * Read files from the paths given
 * 
 * @author ruijs
 *
 */
public class ReadFile {

	/**
	 * 
	 * Static method that returns an ArrayList of rules when given the path for the rules.cf file
	 * 
	 * @param path is the path to the file 
	 * @return ArrayList of rules 
	 */
	public static ArrayList<String> rulesReader(String path){
		
		File file = new File(path);
		List<String> rules = new ArrayList<String>();
		
	    try {
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	        	rules.add(sc.nextLine());
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("Ficheiro não encontrado.");
	    }
	    
		return (ArrayList<String>) rules;
		
	}
	
	public static ArrayList<Mensagem> messageReader(String path){
		
		File file = new File(path);
		ArrayList<Mensagem> messages = new ArrayList<Mensagem>();
	
	    try {
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	        	
	        	String [] split = sc.nextLine().split("\\t");
	        	Mensagem msg= new Mensagem();
	        	ArrayList<String> r= new ArrayList<String>();
	        	
	        	msg.setId(split[0]);
	        	for (int i = 1; i<split.length; i++){
	        		r.add(split[i]);
	        	}
	        	
	        	msg.setRules(r);
	        	messages.add(msg);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("Ficheiro não encontrado.");
	    }
		return messages;
	}
	
	
//	public static void main(String[] args) {
//		ReadFile r = new ReadFile();
//		ArrayList<Mensagem> msgs = r.messageReader("C:/Users/Beatriz/Desktop/Nova pasta/spam.log");
//		System.out.println("Mensagem: " + msgs.get(0).getId());
//		System.out.println("Regras: " + msgs.get(0).getRules());	
//	}
	
}
