package com.example.demo;

import java.io.*;
import java.util.*;
import java.lang.reflect.Field;

public class Pars_Ser_Metadati {
	
	public static ArrayList<Farmacie_Lazio_Metadati> getMetadata() {
		ArrayList<Farmacie_Lazio_Metadati> v = new ArrayList<Farmacie_Lazio_Metadati>();
		Class<?> c = Farmacie_Lazio.class;
		Field[] attributes = c.getDeclaredFields();			
		for(int i=0; i<attributes.length; i++) {
			Metadati annotation = attributes[i].getAnnotation(Metadati.class);
			v.add(new Farmacie_Lazio_Metadati(annotation.name(), annotation.type()));
			}		
	return v;
    }
	
	public static ArrayList<Farmacie_Lazio_Metadati> Serialization_Metadati(File file, ArrayList<Farmacie_Lazio_Metadati> metadati) {
		   try {
			   ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			   output.writeObject(metadati);
			   output.close();
		  } catch(IOException e) {
			  System.out.println("Errore");
			  e.printStackTrace();
		  }
	return metadati;
	}
	
}
