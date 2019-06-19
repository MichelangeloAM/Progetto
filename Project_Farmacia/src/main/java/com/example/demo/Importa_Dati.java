package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

public class Importa_Dati {

	public static void main(String[] args) {

		String url = "https://www.dati.gov.it/api/3/action/package_show?id=886075d1-b5a6-4ee8-ae74-38febaf74108";
		if(args.length == 1)
			url = args[0]; //Url by args ;-)
		try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			 String data = "";
			 String line = "";
			 try {
			   InputStreamReader inR = new InputStreamReader( in );
			   BufferedReader buf = new BufferedReader( inR );
			  
			   while ( ( line = buf.readLine() ) != null ) {
				   data+= line;
				   System.out.println( line );
			   }
			 } finally {
			   in.close();
			 }
			JSONObject obj = (JSONObject) JSONValue.parseWithException(data); 
			JSONObject objI = (JSONObject) (obj.get("result"));
			JSONArray objA = (JSONArray) (objI.get("resources"));
			
			for(Object o: objA){
			    if ( o instanceof JSONObject ) {
			        JSONObject o1 = (JSONObject)o; 
			        String format = (String)o1.get("format");
			        String urlD = (String)o1.get("url");
			        System.out.println(format + " | " + urlD);
			        if(format.equals("csv")) {
			        	download(urlD, "ListaFarmacieLazio.csv");
			        }
			    }
			}
			System.out.println( "OK" );
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void download(String url, String fileName) throws Exception {
	    try (InputStream in = URI.create(url).toURL().openStream()) {
	        Files.copy(in, Paths.get(fileName));
	    }
	}
}












/*import java.io.*;
import java.io.IOException;

public class ImportaDati {
   public static void Importa_Dati(String[] args) {
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
*/