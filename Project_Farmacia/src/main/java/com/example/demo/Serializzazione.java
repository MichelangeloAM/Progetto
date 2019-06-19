package com.example.demo;

import java.io.*;
import java.util.*;

public class Serializzazione {
	
	final static String COMMA_DELIMITER = ";";

	public void Serialization() {   
		
		Vector<Farmacie_Lazio> v = new Vector<Farmacie_Lazio>();
		try (BufferedReader br = new BufferedReader(new FileReader("ListaFarmacieLazio.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				System.out.println(values.length);
				v.add(new Farmacie_Lazio());
			}
			br.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		for(Farmacie_Lazio item: v) {		
			System.out.println(v.toString());
		}
	} 
    
}
