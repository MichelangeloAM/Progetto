package com.example.demo;

import java.lang.reflect.*;
import java.util.ArrayList;

public class Filtri {
	
	private String tipoFiltri;

	public Filtri(String tipoFiltri) {
		this.tipoFiltri = tipoFiltri;
	}
	
	 /*
	 Metodo che attua un'azione di ricerca nella lista di input mandando in output una lista filtrata
	 secondo il tipo di filtro, l'attributo e il valore di riferimento
	 
	 @param attr Attributo su cui filtrare i dati
	 @param ValoreA Valore di riferimento usato nel filtraggio
	 @param ValoreB Valore di riferimento usato nel filtraggio (solo per $or)
	 @param ListX Lista data in input su cui il metodo farà il filtraggio
	 @return	Lista filtrata
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
		
		
		
		if(tipoFiltri.equals("$eq")) {
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
		
		if(tipoFiltri.equals("$or")) {
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
		
		
		
		if(tipoFiltri.equals("$not")) {
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
		
		
		
		if(tipoFiltri.equals("$mag")) {
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
		
		
		if(tipoFiltri.equals("$min")) {
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

	  /*
	  Metodo che segnala se tale filtro è stato effettivamente implementato nel programma
	 
	  @return true se il tipo di filtro esiste, false se non esiste
	  */
	  public boolean Esiste() {
	  
	
		  if(tipoFiltri.equals("$not") || tipoFiltri.equals("$eq") || tipoFiltri.equals("$mag") || tipoFiltri.equals("$min") || tipoFiltri.equals("$or"))
			  return true;
		  else
			  return false;	
	  }
}	
		
		
