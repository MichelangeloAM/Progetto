package com.example.demo;

import java.io.*;
import java.text.ParseException;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.*;

/**
 * @author Ziomike98
 * @author Simdr98
 * 
 */
@SpringBootApplication
public class ProjectFarmaciaApplication {

	public static void main(String[] args) throws ParseException {
		// Download CSV
		Importa_Dati.main(args);
		
		// Parsing-Serialization Dati
		ArrayList<Farmacie_Lazio> list = new ArrayList<Farmacie_Lazio>();
		ArrayList<Farmacie_Lazio> Dati = Serializzazione_Dati.Serialization(new File ("ListaFarmacieLazio.csv"), list);
		System.out.println(Dati);
		
		// Parsing-Serialization Metadati
		ArrayList<Farmacie_Lazio_Metadati> Metadati = Pars_Ser_Metadati.getMetadata();
		File dataFileMeta = new File("Metadati file.dat");
		try {
			dataFileMeta.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		Pars_Ser_Metadati.Serialization_Metadati(dataFileMeta, Metadati);
		
		// Comando avvio Spring App
		SpringApplication.run(ProjectFarmaciaApplication.class, args);
	}
	

}

