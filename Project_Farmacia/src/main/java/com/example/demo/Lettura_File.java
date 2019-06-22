package com.example.demo;

import java.io.*;
import java.util.*;
import java.io.IOException;

/**
 * Classe che si occupa di far ritornare la lista dei dati
 * e la lista dei metadati, essa utilizza due metodi diversi
 * 
 */
public class Lettura_File {
	
	/**
	 * Primo metodo: Lettura Dati
	 *
	 * @param file variabile a cui si assegna il file Excel ListaFarmacieLazio
	 * @return ritorna la lista dei dati
	 * 
	 */
	public static ArrayList<Farmacie_Lazio> LetturaDati(File file){
		ArrayList<Farmacie_Lazio> l = new ArrayList<Farmacie_Lazio>();
		try {
			ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			l = (ArrayList<Farmacie_Lazio>)input.readObject();
			input.close();
		} catch(ClassNotFoundException e) {
			System.out.println("List Not Found");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Error of I/O");
			e.printStackTrace();
		}
		return l;
	}
	
	/**
	 * Secondo metodo: Lettura Metadati
	 * 
	 * @param file variabile a cui si assegna il file Excel ListaFarmacieLazio
	 * @return ritorna la lista dei metadati
	 */
	public static ArrayList<Farmacie_Lazio_Metadati> LetturaMetadati(File file){
		ArrayList<Farmacie_Lazio_Metadati> l = new ArrayList<Farmacie_Lazio_Metadati>();   
		try {
			ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			l = (ArrayList<Farmacie_Lazio_Metadati>)input.readObject();
			input.close();
		} catch(ClassNotFoundException e) {
			System.out.println("List Not Found");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Error of I/O");
			e.printStackTrace();
		}
		return l;
	}
}