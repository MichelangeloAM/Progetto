package com.example.demo;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import com.example.demo.*;

import org.springframework.web.bind.annotation.*;

/**
 * Classe dedicata al controllo dell'input da parte dell'utente
 *
 */

@RestController
public class Controller {
	
	/**
	 * RequestMapping: assegna l'URL a "/metadati"
	 * @return
	 * 
	 */
	@RequestMapping(value="/metadati", method=RequestMethod.GET)
	public ArrayList<Farmacie_Lazio_Metadati> RichiestaMeta(){
		return Lettura_File.LetturaMetadati(new File("metadati file.dat"));
	}
	
	/**
	 * RequestMapping: assegna l'URL a "/dati"
	 * 
	 * @param filter parametro TODO
	 * @param attribute parametro per gestire l'attributo
	 * @param ValoreA parametro per gestire il primo valore da cercare
	 * @param ValoreB parametro per gestire il primo valore da cercare
	 * @return output (riga 66) ritorna l'output
	 * 
	 */
	@RequestMapping(value="/dati", method = RequestMethod.GET)
	public Object DataRequest(@RequestParam(value = "filter", defaultValue = "vuoto")String filter, String attribute, String ValoreA,@RequestParam(value="ValoreB", defaultValue = "0") String ValoreB){
		ArrayList<Farmacie_Lazio> list = Lettura_File.LetturaDati(new File("dati file.dat"));
		ArrayList<Farmacie_Lazio_Metadati> metadata = Lettura_File.LetturaMetadati(new File("metadati file.dat"));
		boolean[] TrovaAttributo = new boolean[metadata.size()];
		for(int i=0; i<metadata.size(); i++) {
			if(!attribute.equals(metadata.get(i).getName())) {
				TrovaAttributo[i] = true;
			}
			else {
				TrovaAttributo[i] = false;
			}
		}
		boolean isNotAttribute = true;
		for(int i=0; i<metadata.size(); i++) {
			isNotAttribute &= TrovaAttributo[i];
		}
		if(isNotAttribute) {
			return "Attributo non valido!";
		}
		if(filter.equals("vuoto"))
			return list;
		else {
			Filtri filtro = new Filtri(filter);
			if(!filtro.Esiste())
				return "Filtro inesistente!";
			ArrayList<Farmacie_Lazio> output = (ArrayList<Farmacie_Lazio>)filtro.Ricerca(attribute, ValoreA, ValoreB, list);
			if(output.size() == 0)
				return "Non c'é corrispondenza con nessun elemento analizzato!";
			else
				return output;
		}
	}
	
	/**
	 * Oggetto per la richiesta delle statistiche giusto?
	 * 
	 * @param filter parametro che gestisce il filtro scelto
	 * @param attribute parametro per gestire l'attributo
	 * @param ValoreA parametro per gestire il primo valore da cercare
	 * @param ValoreB parametro per gestire il primo valore da cercare
	 * @return a seconda del caso ritorna le statistiche
	 * 
	 */
	
	@RequestMapping(value="/statistics", method = RequestMethod.GET)
	public Object StatisticsRequest(@RequestParam(value="filter", defaultValue = "vuoto")String filter, String attribute, String ValoreA, @RequestParam(value = "ValoreB", defaultValue = "0")String ValoreB){
		ArrayList<Object> attributes = new ArrayList<Object>();
		try{
			Method metodo = Farmacie_Lazio.class.getMethod("get" + attribute.substring(0,1).toUpperCase() + attribute.substring(1));
			ArrayList<Farmacie_Lazio> list = Lettura_File.LetturaDati(new File("data file.dat"));
			ArrayList<Farmacie_Lazio_Metadati> metadata = Lettura_File.LetturaMetadati(new File("metadata file.dat"));
			boolean[] TrovaAttributo = new boolean[metadata.size()];
			for(int i=0; i<metadata.size(); i++) {
				if(!attribute.equals(metadata.get(i).getName())) {
					TrovaAttributo[i] = true;
				}
				else {
					TrovaAttributo[i] = false;
				}
			}
			boolean isNotAttribute = true;
			for(int i=0; i<metadata.size(); i++) {
				isNotAttribute &= TrovaAttributo[i];
			}
			if(isNotAttribute) {
				return "Attributo non valido!";
			}
			if(filter.equals("Vuoto")) {
				for(Farmacie_Lazio obj : list) {
					attributes.add(metodo.invoke(obj));
				}
			}
			else {
				Filtri filtro = new Filtri(filter);
				if(!filtro.Esiste())
					return "Filtro inesistente!";
				ArrayList<Farmacie_Lazio> vFiltered = (ArrayList<Farmacie_Lazio>)filtro.Ricerca(attribute, ValoreA, ValoreB, list);
				for(Farmacie_Lazio obj : vFiltered) {
					attributes.add(metodo.invoke(obj));
				}
			}
		} catch(NoSuchMethodException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		} catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		if(attributes.size() == 0)
			return "Non c'é corrispondenza con nessun elemento analizzato!";
		if(attributes.get(0) instanceof String) {
			 ArrayList<String> list_string = new ArrayList<String>();
			  for(Object obj : attributes) {
				  String string = (String) obj;
				  list_string.add(string);
			  }
			  return Verifica_Celle.getStatsString(list_string);
		  }
		else {
			ArrayList<Double> lNumber = new ArrayList<Double>();
			for(Object number : attributes)
				lNumber.add((Double)number);
			return lNumber;
		}
	}
}