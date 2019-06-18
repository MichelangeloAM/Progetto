package com.example.demo;

import java.io.FileReader;
import java.io.IOException;

public class Partita_Iva {
    public static void partita (String p) {
    	try {
    		int next;
    		FileReader reader = new FileReader ("C:\\Users\\UTENTE\\Desktop\\Programmazione-Progetto\\parafarmaciereglazio.csv");
    		do {
    		next = reader . read ();
    		if ( next != -1) {
    		char c = ( char ) next ;
    		System . out . print ( c );
    		}
    		} while ( next != -1);
    		reader.close();
    	}
    	
    	catch ( IOException e) {
    		System . out . println (" ERRORE di I/O");
    		System . out . println (e );
    		}
    }
}
