package com.example.demo;

public class Output_Verifica_Stringhe {
	
	private String stringa;
	private int ripetizioni;
	
	public Output_Verifica_Stringhe(String stringa, int ripetizioni) {
		this.stringa = stringa;
		this.ripetizioni = ripetizioni;
	}

	public String getStringa() {
		return stringa;
	}

	public void setStringa(String stringa) {
		this.stringa= stringa;
	}

	public int getRipetizioni() {
		return ripetizioni;
	}

	public void setRipetizioni(int ripetizioni) {
		this.ripetizioni = ripetizioni;
	}

	@Override
	public String toString() {
		return "Output_Verifica_Stringhe [Stringa=" + stringa + ", ripetizioni=" + ripetizioni + "]";
	}
}
