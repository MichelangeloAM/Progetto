package com.example.demo;

import java.lang.reflect.*;
import java.util.ArrayList;

public class Filtri {
	
	/**
	 * Classe Filtri, con il compito di filtrare la lista fornita in input su richiesta dal controllore.
	 * 
	 * 
	 */
	
	private String tipoFiltri;

	public Filtri(String tipoFiltri) {
		this.tipoFiltri = tipoFiltri;
	}
	
	/**
	 * Questo metodo svolge l'azione di ricerca all'interno della lista Farmacie_Lazio, dando come output
	 * una lista filtrata in base ai filtri richiesti, agli attributi ed al valore di rifermento.
	 *  
	 * @param attr abbreviazione di attributo, esso è l'attributo su cui vengono filtrati i dati
	 * @param ValoreA valore per il filtraggio
	 * @param ValoreB valore per il filtraggio
	 * @param ListX lista fornita su cui fare il filtraggio
	 * @return ritorna una lista filtrata
	 */
	public Object Ricerca(String attr, String ValoreA, String ValoreB, ArrayList<Farmacie_Lazio> ListX){
		
		boolean Num = true;
		boolean Long_ = true;
		boolean Double_ = true;
		ArrayList<Farmacie_Lazio> ListY = new ArrayList<Farmacie_Lazio>();
		Method metodo;
		Double ValoreNumericoDouble1 = null;
		Double ValoreNumericoDouble2 = null;
		Long ValoreNumericoLong1 = null;
		Long ValoreNumericoLong2 = null;
		
		try {
			metodo = Farmacie_Lazio.class.getMethod("get" + attr.substring(0,1).toUpperCase() + attr.substring(1));
		}
		catch(NoSuchMethodException e) {
			e.printStackTrace();
			return "Non esiste!";
		}
		
		
		try {
			ValoreNumericoDouble1 = Double.parseDouble(ValoreA);
			ValoreNumericoDouble2 = Double.parseDouble(ValoreB);
		}
		catch(NumberFormatException e) {
			Double_ = false;
		}
		
		try {
			ValoreNumericoLong1 = Long.parseLong(ValoreA);
			ValoreNumericoLong2 = Long.parseLong(ValoreB);
		}
		catch(NumberFormatException e) {
			Long_ = false;
		}
		
		if(Long_ || Double_)
			Num = true;
		else
			Num = false;
		
		
		
		if(tipoFiltri.equals("$uguale")) {
			if(Num) {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof Double) {
							Double temp = (Double)metodo.invoke(obj);
							if(temp.equals(ValoreNumericoDouble1)) {
								ListY.add(obj);
							}
						}
						
						if(metodo.invoke(obj) instanceof Long) {
							Long temp = (Long)metodo.invoke(obj);
							if(temp.equals(ValoreNumericoLong1)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof String) {
							String temp = (String)metodo.invoke(obj);
							if(temp.equals(ValoreA)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		if(tipoFiltri.equals("$altro")) {
			if(Num) {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof Double) {
							Double temp = (Double)metodo.invoke(obj);
							if(temp.equals(ValoreNumericoDouble1) || temp.equals(ValoreNumericoDouble2)) {
								ListY.add(obj);
							}
						}
						
						if(metodo.invoke(obj) instanceof Long) {
							Long temp = (Long)metodo.invoke(obj);
							if(temp.equals(ValoreNumericoLong1) || temp.equals(ValoreNumericoLong2)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof String) {
							String temp = (String)metodo.invoke(obj);
							if(temp.equals(ValoreA) || temp.equals(ValoreB)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		if(tipoFiltri.equals("$nonuguale")) {
			if(Num) {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof Double) {
							Double temp = (Double)metodo.invoke(obj);
							if(!temp.equals(ValoreNumericoDouble1)) {
								ListY.add(obj);
							}
						}
						
						if(metodo.invoke(obj) instanceof Long) {
							Long temp = (Long)metodo.invoke(obj);
							if(!temp.equals(ValoreNumericoLong1)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof String) {
							String temp = (String)metodo.invoke(obj);
							if(!temp.equals(ValoreA)) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		if(tipoFiltri.equals("$maggiore")) {
			if(Num) {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof Double) {
							Double temp = (Double)metodo.invoke(obj);
							if(temp.compareTo(ValoreNumericoDouble1) > 0) {
								ListY.add(obj);
							}
						}
						
						if(metodo.invoke(obj) instanceof Long) {
							Long temp = (Long)metodo.invoke(obj);
							if(temp.compareTo(ValoreNumericoLong1) > 0) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		if(tipoFiltri.equals("$minore")) {
			if(Num) {
				try {
					for(Farmacie_Lazio obj : ListX) {
						if(metodo.invoke(obj) instanceof Double) {
							Double temp = (Double)metodo.invoke(obj);
							if(temp.compareTo(ValoreNumericoDouble1) < 0) {
								ListY.add(obj);
							}
						}
						
						if(metodo.invoke(obj) instanceof Long) {
							Long temp = (Long)metodo.invoke(obj);
							if(temp.compareTo(ValoreNumericoLong1) < 0) {
								ListY.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
			
		return ListY;
	}

	  /**
	  *Metodo che ritorna true, se il metodo è stato implementato e
	  *false, se il metodo non è stato implementato.
	  *
	  *@return true se esiste
	  *@return false se non esiste
	  */
	  public boolean Esiste() {
	  
	
		  if(tipoFiltri.equals("$uguale") || tipoFiltri.equals("$maggiore") || tipoFiltri.equals("$minore") || tipoFiltri.equals("$altro") || tipoFiltri.equals("$nonuguale"))
			  return true;
		  else
			  return false;	
	  }
}	
