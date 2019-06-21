package com.example.demo;
import java.io.*;
import java.io.IOException;

public class Lettura_File {
   public static void Visualizza_Dati() {
	   String ln = "";
	   String Separatore = ";";
	   try {
		   
		   BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\UTENTE\\Desktop\\Programmazione-Progetto\\parafarmaciereglazio.csv"));
		   ln = br.readLine(); //serve a non leggere la prima riga
		   br.close();
	   	   }
	   catch ( IOException e) {
		e.printStackTrace();
	   }
   }
}