package com.example.demo;
import java.io.*;
import java.io.IOException;

public class Lettura_File {
   public static void Visualizza_Dati(Farmacie_Lazio e2) {
	   String ln = "";
	   String separatore = ";";
	   try {
		   
		   BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\UTENTE\\Desktop\\Programmazione-Progetto\\parafarmaciereglazio.csv"));
		   ln = br.readLine(); //serve a non leggere la prima riga
		   do {
			  System.out.println(br.readLine()); 
		   } 
		   while((ln = br.readLine()) != null);
		   br.close();
	   	   }
	   catch ( IOException e) {
		e.printStackTrace();
	   }
   }
}