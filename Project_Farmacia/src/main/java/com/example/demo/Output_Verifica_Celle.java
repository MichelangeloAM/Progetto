package com.example.demo;

public class Output_Verifica_Celle {
	
	private String Cella;
	private int Clone;
	
	public Output_Verifica_Celle(String Cella, int Clone) {
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

	@Override
	public String toString() {
		return "Output_Verifica_Celle [Cella=" + Cella + ", Clone=" + Clone + "]";
	}
}
