package com.example.demo;

import java.util.ArrayList;

public class Verifica_Celle {
	
	private String Cella;
	private int Clone;
	
	public Verifica_Celle(String Cella, int Clone) {
		this.Cella = Cella;
		this.Clone = Clone;
	}

	public static ArrayList<Verifica_Celle> getStatsString(ArrayList<String> strings) {
		
		ArrayList<Verifica_Celle> stats = new  ArrayList<Verifica_Celle>();
		String Cella;
		int RicorrenzaSupp;
		Verifica_Celle Supp;
		Boolean Verificato;
		
		for(int i = 0;i < strings.size();i++){
			Verificato = false;
			Cella = strings.get(i);
	        RicorrenzaSupp = 1;
	        
		    for(int j = 0;j < stats.size() && !Verificato;j++){
		      if(Cella.equals(stats.get(j).getCella())){
		        Verificato = true;
		        RicorrenzaSupp = stats.get(j).getClone() + 1;
		        Supp = new Verifica_Celle(Cella,RicorrenzaSupp);
		        stats.set(j, Supp);
		       }
		    }
		    
		    if(!Verificato) {
		    	Supp = new Verifica_Celle(Cella,RicorrenzaSupp);
		    	stats.add(Supp);
		    }
		  }
		  return stats;
	}

	public int getClone() {
		return Clone;
	}

	public String getCella() {
		return Cella;
	}
}

