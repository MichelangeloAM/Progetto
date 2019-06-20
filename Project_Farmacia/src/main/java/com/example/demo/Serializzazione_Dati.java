package com.example.demo;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Serializzazione_Dati {
	
	final static String COMMA_DELIMITER = ";";

	public void Serialization() throws ParseException {   
		
		Vector<Farmacie_Lazio> v = new Vector<Farmacie_Lazio>();
		try (BufferedReader br = new BufferedReader(new FileReader("ListaFarmacieLazio.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				SimpleDateFormat format = new SimpleDateFormat ("dd-MM-yyyy");
				values[12] = format.format( new Date() );
				values[13] = format.format( new Date() );		
				Date date12 = format.parse (values[12]);
		        Date date13 = format.parse (values[13]);
				System.out.println(values.length);
				v.add(new Farmacie_Lazio(values[1], values[2], values[3], Double.parseDouble(values[14]), 
										 values[4], values[5], values[6], values[7], values[8], values[9], 
										 values[10], values[11], Integer.parseInt(values[16]), Double.parseDouble(values[15]), 
										 Integer.parseInt(values[0]),date12,date13));
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
