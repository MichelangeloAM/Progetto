package com.example.demo;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Classe addetta alla serializzazione dei dati
 *
 */
public class Serializzazione_Dati {
	
	/**
	 * Dichiarazione del delimitatore dei dati
	 * 
	 */
	final static String COMMA_DELIMITER = ";";

	/**
	 * Svolgimento della Serializzazione dei dati
	 * 
	 * @param file variabile a cui si assegna il file Excel ListaFarmacieLazio
	 * @param list lista dove salva i dati
	 * @return ritorna la lista con i dati serializzati
	 * @throws ParseException eccezzione
	 * 
	 */
	public static ArrayList<Farmacie_Lazio> Serialization(File file, ArrayList<Farmacie_Lazio> list) throws ParseException {   
		
		list = new ArrayList<Farmacie_Lazio>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				SimpleDateFormat format = new SimpleDateFormat ("dd-MM-yyyy");
				values[12] = format.format( new Date() );
				values[13] = format.format( new Date() );		
				Date date12 = format.parse (values[12]);
		        Date date13 = format.parse (values[13]);
				System.out.println(values.length);
				list.add(new Farmacie_Lazio(values[1], values[2], values[3], Double.parseDouble(values[14]), 
										 values[4], values[5], values[6], values[7], values[8], values[9], 
										 values[10], values[11], Integer.parseInt(values[16]), Double.parseDouble(values[15]), 
										 Integer.parseInt(values[0]),date12,date13));
			}
			br.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		return list;
		}
	} 
    

