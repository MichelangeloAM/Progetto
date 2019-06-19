package com.example.demo;

import java.io.*;
import java.util.*;

public class Serializzazione {
	
	final static String COMMA_DELIMITER = ";";

	public void Serialization() {   
		Farmacie_Lazio e = new Farmacie_Lazio();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Farmacie_Lazio.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in Farmacie_Lazio.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

}

		Farmacie_Lazio e1 = null; {		
		try {
			FileInputStream fileIn = new FileInputStream("Farmacie_Lazio.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e1 = (Farmacie_Lazio) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Farmacie_Lazio class not found");
			c.printStackTrace();
		}

		List<List<String>> records = new ArrayList<>();
		Vector<Farmacie_Lazio> v = new Vector<Farmacie_Lazio>();
		try (BufferedReader br = new BufferedReader(new FileReader("book.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				System.out.println(values.length);
				records.add(Arrays.asList(values));
				v.add(new Farmacie_Lazio());
			}
			br.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		for(Farmacie_Lazio item: v) {		
			System.out.println(v.toString());
		}

		List<List<String>> records2 = new ArrayList<>();
		try (Scanner s = new Scanner(new File("book.csv"));) {
			while (s.hasNextLine()) {
				records2.add(getRecordFromLine(s.nextLine()));
			}
			s.close();
		} catch (IOException i) {
			i.printStackTrace();
			}
		}

	private static List<String> getRecordFromLine(String line) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(COMMA_DELIMITER);
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	} 
    
}
