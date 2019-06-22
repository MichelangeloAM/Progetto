package com.example.demo;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import com.example.demo.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@RequestMapping(value="/metadata", method=RequestMethod.GET)
	public ArrayList<Farmacie_Lazio_Metadati> RichiestaMeta(){
		return Lettura_File.LetturaMetadati(new File("metadata file.dat"));
	}
	
	@RequestMapping(value="/data", method = RequestMethod.GET)
	public Object DataRequest(@RequestParam(value = "filter", defaultValue = "vuoto")String filter, String attribute, String value1,@RequestParam(value="value2", defaultValue = "0") String value2){
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
			return "Attributo inserito non valido";
		}
		if(filter.equals("vuoto"))
			return list;
		else {
			Filtri filtro = new Filtri(filter);
			if(!filtro.Esiste())
				return "Filtro usato non esistente";
			ArrayList<Farmacie_Lazio> output = (ArrayList<Farmacie_Lazio>)filtro.Ricerca(attribute, value1, value2, list);
			if(output.size() == 0)
				return "Nessun elemento corrisponde a questa richiesta";
			else
				return output;
		}
	}
	
	@RequestMapping(value="/statistics", method = RequestMethod.GET)
	public Object StatisticsRequest(@RequestParam(value="filter", defaultValue = "vuoto")String filter, String attribute, String value1, @RequestParam(value = "value2", defaultValue = "0")String value2){
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
				return "Attributo inserito non valido";
			}
			if(filter.equals("vuoto")) {
				for(Farmacie_Lazio obj : list) {
					attributes.add(metodo.invoke(obj));
				}
			}
			else {
				Filtri filtro = new Filtri(filter);
				if(!filtro.Esiste())
					return "Filtro usato non esistente";
				ArrayList<Farmacie_Lazio> vFiltered = (ArrayList<Farmacie_Lazio>)filtro.Ricerca(attribute, value1, value2, list);
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
			return "Nessun elemento corrisponde a questa richiesta";
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