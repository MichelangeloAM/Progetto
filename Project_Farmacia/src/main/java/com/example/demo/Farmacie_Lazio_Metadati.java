package com.example.demo;

import java.io.Serializable;

/**
 *Classe dedicata alla gestione dei Metadati
 */
public class Farmacie_Lazio_Metadati implements Serializable {
	public static final long serialVersionUID = 1L; 
	private String Name;
	private String Type;

	/**
	 * La Classe gestisce la struttura dei metadati atrtraverso il costruttore
	 * e i metodi toString, get e set
	 * 
	 * @param Name variabile che controlla il nome del metadato
	 * @param Type variabile che controlla il type del metadato
	 * 
	 */
	public Farmacie_Lazio_Metadati (String Name, String Type) {
		this.Name = Name;
		this.Type = Type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}
	
	@Override
	public String toString() {
		return "Farmacie_Lazio_Metadati [Name = " + Name + ", Type = " + Type + "]";
	}

}