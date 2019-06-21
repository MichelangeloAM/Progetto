package com.example.demo;

import java.io.Serializable;

public class Farmacie_Lazio_Metadati implements Serializable {
	public static final long serialVersionUID = 1L; 
	private String Name;
	private String Type;

	public Farmacie_Lazio_Metadati (String Name, String Type) {
		this.Name = Name;
		this.Type = Type;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @return the Type
	 */
	public String getType() {
		return Type;
	}

	/**
	 * @param Type the Type to set
	 */
	public void setType(String Type) {
		this.Type = Type;
	}
	
	@Override
	public String toString() {
		return "Farmacie_Lazio_Metadati [Name = " + Name + ", Type = " + Type + "]";
	}

}