package com.example.demo;

import java.io.*;
import java.lang.annotation.*;

public class Farmacie_Lazio implements Serializable {
    private String DenominazioneSitoLogistico ;
    private String Indirizzo;
    private String PartitaIva;
    private int Latitudine;
	public Farmacie_Lazio() {
		// TODO Auto-generated constructor stub
	}
	public Farmacie_Lazio(String DenominazioneSitoLogistico, String Indirizzo, String PartitaIva, int number) {
		// TODO Auto-generated constructor stub
		this.DenominazioneSitoLogistico = DenominazioneSitoLogistico;
		this.Indirizzo = Indirizzo;
		this.PartitaIva = PartitaIva;
		this.Latitudine = Latitudine;
	}
	
	public String getDenominazioneSitoLogistico() {
		return DenominazioneSitoLogistico;
	}
	public void setDenominazioneSitoLogistico(String DenominazioneSitoLogistico) {
		this.DenominazioneSitoLogistico = DenominazioneSitoLogistico;
	}
	public String getAIndirizzo() {
		return Indirizzo;
	}
	public void setIndirizzo(String Indirizzo) {
		this.Indirizzo = Indirizzo;
	}
	public String getPartitaIva() {
		return PartitaIva;
	}
	public void setPartitaIva(int partitaIva) {
		this.PartitaIva = PartitaIva;
	}
	public int getLatitudine() {
		return Latitudine;
	}
	public void setLatitudine(int Latitudine) {
		this.Latitudine = Latitudine;
	}
	@Override
	public String toString() {
		return "custom method toString for Employee [DenominazioneSitoLogistico=" + DenominazioneSitoLogistico + ", Indirizzo=" + Indirizzo + ", PartitaIva=" + PartitaIva + ", Latitudine=" + Latitudine + "]";
	}
}
