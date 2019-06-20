package com.example.demo;

import java.util.ArrayList;

public class Verifica_Celle { //Classe Celle
	
public static ArrayList<Output_Verifica_Celle> getStatsString(ArrayList<String> strings) {
		
	ArrayList<Output_Verifica_Celle> stats = new  ArrayList<Output_Verifica_Celle>();
	String Cella;
	int RicorrenzaSupp;
	Output_Verifica_Celle Supp;
	Boolean Verificato;
		
	for(int i = 0;i < strings.size();i++){
		Verificato = false;
		Cella = strings.get(i);
	    RicorrenzaSupp = 1;
	        
	    for(int j = 0;j < stats.size() && !Verificato;j++){
	    	if(Cella.equals(stats.get(j).getCella())){
	    		Verificato = true;
		        RicorrenzaSupp = stats.get(j).getClone() + 1;
		        Supp = new Output_Verifica_Celle (Cella,RicorrenzaSupp);
		        stats.set(j, Supp);
		       }
		    }
		    
		    if(!Verificato) {
		    	Supp = new Output_Verifica_Celle(Cella,RicorrenzaSupp);
		    	stats.add(Supp);
		    }
		}
	return stats;
	}	
}

	
