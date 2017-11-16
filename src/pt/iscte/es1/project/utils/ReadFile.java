package pt.iscte.es1.project.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	
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
	
	
	
	
}
