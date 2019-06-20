package com.example.demo;

import java.util.ArrayList;

public class Verifica_Stringhe {

	public static ArrayList<Verifica_Stringhe> getStatsString(ArrayList<String> strings) {
		
		ArrayList<Verifica_Stringhe> stats = new  ArrayList<Verifica_Stringhe>();
		String stringa;
		int ricorrSupport;
		Verifica_Stringhe support;
		Boolean presente;
		
		for(int i = 0;i < strings.size();i++){
			presente = false;
			stringa = strings.get(i);
	        ricorrSupport = 1;
	        
		    for(int j = 0;j < stats.size() && !presente;j++){
		      if(stringa.equals(stats.get(j).getStringa())){
		        presente = true;
		        ricorrSupport = stats.get(j).getRipetizioni() + 1;
		        support = new Verifica_Stringhe(stringa,ricorrSupport);
		        stats.set(j, support);
		       }
		    }
		    
		    if(!presente) {
		    	support = new Verifica_Stringhe(stringa,ricorrSupport);
		    	stats.add(support);
		    }
		  }
		  return stats;
	}
}

