package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	/* 
	 * Classe per la gestione delle funzioni di spring boot
	 */
	
	@RequestMapping(value="/dati", method = RequestMethod.GET)
	public Object Ricerca (@RequestParam(value="filtri", defaultValue = "empty")String filter, String attributo, String val1, 
						   @RequestParam(value="valoreB", defaultValue = "0") String valoreB) {
		
		ArrayList <Farmacie_Lazio> List = new ArrayList<Farmacie_Lazio>();
	
		
	}
}

		
		
		

    

