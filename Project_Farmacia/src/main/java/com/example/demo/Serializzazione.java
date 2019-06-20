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
				v.add(new Farmacie_Lazio(values[1], values[2], values[3], Integer.parseInt(values[14]), values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11], Integer.parseInt(values[16]), Integer.parseInt(values[15]), Integer.parseInt(values[0]), SimpleDateFormat.parse(values[12]), SimpleDateFormat.parse(values[13]) ));
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
