package com.example.demo;

/**
 * Classe addetta all'output della Classe Verifica_Celle
 *
 */
public class Output_Verifica_Celle {
	
	private String Cella;
	private int Clone;
	
	/**
	 * Classe Output_Verifica_Celle
	 * 
	 * @param Cella cella verificata
	 * @param Clone numero di ripetizioni
	 * 
	 */
	public Output_Verifica_Celle (String Cella, int Clone) {
		this.Cella = Cella;
		this.Clone = Clone;
	}
		
	public String getCella() {
		return Cella;
	}

	public void setCella(String Cella) {
		this.Cella = Cella;
	}

	public int getClone() {
		return Clone;
	}

	public void setClone(int Clone) {
		this.Clone = Clone;
	}
	
	/**
	 * Metodo toString per visualizzare tutti le celle e il numero
	 * di ripetizioni
	 * 
	 */
	@Override
	public String toString() {
		return "Output_Verifica_Celle [Cella=" + Cella + ", Clone=" + Clone + "]";
	}
}
