package pt.iscte.es1.project.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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
	
	public static double[] fpfnReader(){
		
		double[] resultadoFinal = new double[3];
		double falsos_positivos = 0;
		double falsos_negativos = 0;
		
		File file = new File("experimentBaseDirectory/referenceFronts/AntiSpamFilterProblem.rf");
	
	    try {
	        Scanner sc = new Scanner(file);
	        int i = 0;
	        int linhafinal = 0;
	        while (sc.hasNextLine()) {
	        	
	        	String[] split = sc.nextLine().split(" ");
	        	if(i == 0){
	        		falsos_positivos = Double.parseDouble(split[0]);
		        	falsos_negativos = Double.parseDouble(split[1]);
	        	}
	        	else{
	        		if(Double.parseDouble(split[0]) < falsos_positivos){
	        			falsos_positivos = Double.parseDouble(split[0]);
	    	        	falsos_negativos = Double.parseDouble(split[1]);
	    	        	linhafinal=i;
	        		}
	        	}
	        	i++;
	        }
	        sc.close();
	        
	        resultadoFinal[0] = falsos_positivos;
	        resultadoFinal[1] = falsos_negativos;
	        resultadoFinal[2] = linhafinal;    
	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("Ficheiro não encontrado.");
	    }
		System.out.println("Falsos Positivos: " + resultadoFinal[0]  + " / Falsos Negativos: " + resultadoFinal[1] + " / Configuração Escolhida: " + resultadoFinal[2]);
		return resultadoFinal; 
	}
	
	public static double[] pesosReader(double nlinha, int numRegras){
		
		double[] pesos = new double[numRegras];
		File file = new File("experimentBaseDirectory/referenceFronts/AntiSpamFilterProblem.rs");
		
	    try {
	        Scanner sc = new Scanner(file);
	        int i = 0;
	        
	        while (sc.hasNextLine()) {
	        	String[] split = sc.nextLine().split(" ");
	        	if(i == nlinha){	
	        		for(int j = 0 ; j<split.length ; j++){
	        			pesos[j] = Double.parseDouble(split[j]);
//	        			System.out.println("LEITURA  DE PESOS " + pesos[j]);
	        		}
	        	}
	        	i++;
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("Ficheiro não encontrado.");
	    }
		
		return pesos;
	}
	
	public static void guardarConfig(ArrayList<String> rules, double[] pesos){
		
		try {
		File file = new File("AntiSpamConfigurationForProfessionalMailbox/rules.cf");
		BufferedWriter save = new BufferedWriter(new FileWriter(file));
		
		for(int i = 0; i < rules.size(); i++){
				save.write(rules.get(i) +  "	" + Double.toString(pesos[i]));
				save.newLine();
		}
		save.close();
		System.out.println("Guardadas configurações no ficheiro rules.cf");
		} catch (IOException e) {
			System.out.println("Erro a guardar ficheiro de configurações!");		
		}
		
	}
	
	
//	public static void main(String[] args) {
//		ReadFile r = new ReadFile();
//		ArrayList<Mensagem> msgs = r.messageReader("C:/Users/Beatriz/Desktop/Nova pasta/spam.log");
//		System.out.println("Mensagem: " + msgs.get(0).getId());
//		System.out.println("Regras: " + msgs.get(0).getRules());	
//	}
	
}
