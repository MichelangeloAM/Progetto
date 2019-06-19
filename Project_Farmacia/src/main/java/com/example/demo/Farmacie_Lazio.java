package com.example.demo;

import java.io.*;
import java.lang.annotation.*;
import java.sql.Date;

public class Farmacie_Lazio implements Serializable {
    private String DenominazioneSitoLogistico ;
    private String Indirizzo;
    private String PartitaIva;
    private double Latitudine;
    private String CAP;
    private String CodiceComuneIstat;
    private String DescrizioneComune;
    private String CodiceProvinciaIstat;
    private String SiglaProvincia;
    private String DescrizioneProvincia;
    private String CodiceRegione;
    private String DescrizioneRegione;
    private int Localize;
    private double Longitudine;
    private int CodiceIdentificativoSito;
    private Date DataInizio;
    private Date DataFine;
	public Farmacie_Lazio() {
		// TODO Auto-generated constructor stub
	}
	
	public Farmacie_Lazio(String DenominazioneSitoLogistico, String Indirizzo, String PartitaIva, 
						  double Latitudine, String CAP, String CodiceComuneIstat, String DescrizioneComune, 
						  String CodiceProvinciaIstat, String SiglaProvincia, String DescrizioneProvincia,
						  String CodiceRegione, String DescrizioneRegione, int Localize, double Longitudine,
						  int CodiceIdentificativoSito, Date DataInizio, Date DataFine) {
		
		// TODO Auto-generated constructor stub
		this.DenominazioneSitoLogistico = DenominazioneSitoLogistico;
		this.Indirizzo = Indirizzo;
		this.PartitaIva = PartitaIva;
		this.Latitudine = Latitudine;
		this.CAP = CAP;
		this.CodiceComuneIstat = CodiceComuneIstat;
		this.DescrizioneComune = DescrizioneComune;
		this.CodiceProvinciaIstat = CodiceProvinciaIstat;
		this.SiglaProvincia = SiglaProvincia;
		this.DescrizioneProvincia = DescrizioneProvincia;
		this.CodiceRegione = CodiceRegione;
		this.DescrizioneRegione = DescrizioneRegione;
		this.Localize = Localize;
		this.Longitudine = Longitudine;
		this.CodiceIdentificativoSito = CodiceIdentificativoSito;
		this.DataInizio = DataInizio;
		this.DataFine = DataFine;
	}
	
	public String getDenominazioneSitoLogistico() {
		return DenominazioneSitoLogistico;
	}
	public void setDenominazioneSitoLogistico(String DenominazioneSitoLogistico) {
		this.DenominazioneSitoLogistico = DenominazioneSitoLogistico;
	}
	public String getIndirizzo() {
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
	public double getLatitudine() {
		return Latitudine;
	}
	public void setLatitudine(double Latitudine) {
		this.Latitudine = Latitudine;
	}
	public void setCAP(String CAP) {
		this.CAP = CAP;
	}
	public String getCAP() {
		return CAP;
	}
	public void setCodiceComuneIstat(String CodiceComuneIstat) {
		this.CodiceComuneIstat = CodiceComuneIstat;
	}
	public String getCodiceComuneIstat() {
		return CodiceComuneIstat;
	}
	public void setDescrizioneComune(String DescrizioneComune) {
		this.DescrizioneComune = DescrizioneComune;
	}
	public String getDescrizioneComune() {
		return DescrizioneComune;
	}
	public void setCodiceProvinciaIstat(String CodiceProvinciaIstat) {
		this.CodiceProvinciaIstat = CodiceProvinciaIstat;
	}
	public String getCodiceProvinciaIstat() {
		return CodiceProvinciaIstat;
	}
	public void setSiglaProvincia(String SiglaProvincia) {
		this.SiglaProvincia = SiglaProvincia;
	}
	public String getSiglaProvincia() {
		return SiglaProvincia;
	}
	public void setDescrizioneProvincia(String DescrizioneProvincia) {
		this.DescrizioneProvincia = DescrizioneProvincia;
	}
	public String getDescrizioneProvincia() {
		return DescrizioneProvincia;
	}
	public void setCodiceRegione(String CodiceRegione) {
		this.CodiceRegione = CodiceRegione;
	}
	public String getCodiceRegione() {
		return CodiceRegione;
	}
	public void setDescrizioneRegione(String DescrizioneRegione) {
		this.DescrizioneRegione = DescrizioneRegione;
	}
	public String getDescrizioneRegione() {
		return DescrizioneRegione;
	}
	public int getLocalize() {
		return Localize;
	}
	public void setLocalize(int Localize) {
		this.Localize = Localize;
	}	
	public double getLongitudine() {
		return Longitudine;
	}
	public void setLongitudine(double Longitudine) {
		this.Longitudine = Longitudine;
	}
	public int getCodiceIdentificativoSito() {
		return CodiceIdentificativoSito;
	}
	public void setCodiceIdentificativoSito(int CodiceIdentificativoSito) {
		this.CodiceIdentificativoSito = CodiceIdentificativoSito;
	}
	public void setDataInizio(Date DataInizio) {
		this.DataInizio = DataInizio;
	}
	public Date getDataInizio() {
		return DataInizio;
	}
	public void setDataFine(Date DataFine) {
		this.DataFine = DataFine;
	}
	public Date getDataFine() {
		return DataFine;
	}	
	
	@Override
	public String toString() {
		return "custom method toString for Farmacie_Lazio [DenominazioneSitoLogistico=" + 
				DenominazioneSitoLogistico + ", Indirizzo=" + Indirizzo + ", PartitaIva=" + 
				PartitaIva + ", Latitudine=" + Latitudine + ", CAP=" + CAP + ", CodiceComuneIstat=" + 
				CodiceComuneIstat + ", DescrizioneComune=" + DescrizioneComune + ", CodiceProvinciaIstat=" + 
				CodiceProvinciaIstat + ", SiglaProvincia=" + SiglaProvincia +", DescrizioneProvincia=" +
				DescrizioneProvincia + ", CodiceRegione=" + CodiceRegione + ", DescrizioneRegione=" + 
				DescrizioneRegione +", Localize=" + Localize + ", Longitudine=" + Longitudine + ", CodiceIdentificativoSito="
				 + CodiceIdentificativoSito + ", DataFine=" + DataFine + "]";
	}
}
