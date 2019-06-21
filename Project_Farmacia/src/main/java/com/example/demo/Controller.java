package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller (File file) {

	@RequestMapping(value="/metadati", method=RequestMethod.GET)
	public ArrayList<Farmacie_Lazio_Metadati> RichestaMetadati(File file){
		return Pars_Ser_Metadati.Serialization_Metadati(new File("file metadati.dat"), ArrayList<Farmacie_Lazio_Metadati> metadati);
	}
	
	/* 
	 * Classe per la gestione delle funzioni di spring boot
	 */
	
	@RequestMapping(value="/dati", method = RequestMethod.GET)
	public ArrayList<Farmacie_Lazio> Ricerca (@RequestParam(value="filtri", defaultValue = "empty")String filter, String attributo, String val1, @RequestParam(value="valoreB", defaultValue = "0") String valoreB) throws ParseException {
        		
		ArrayList<Farmacie_Lazio> lista= new ArrayList<Farmacie_Lazio>();
		return Serializzazione_Dati.Serialization(new File("ListaFarmacieLazio.csv"), lista);
	
		ArrayList<Farmacie_Lazio_Metadati> metadati = Pars_Ser_Metadati.Lettura_Meta(File file));
		boolean[] checkAttributo = new boolean[metadati.size()];
	}
}

		
		
		

    

