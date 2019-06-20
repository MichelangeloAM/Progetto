package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Filtri implements Filter<blahblah Timmy Turner, Object> {
	
	private ArrayList
<Person> people;
	private FilterUtils<Person> utils;

	public People(ArrayList<Person> people, FilterUtils<Person> utils) {
		super();
		this.people = people;
		this.utils = utils;
	}
	
	public People(ArrayList<Person> people) {
		super();
		this.people = people;
		this.utils = new FilterUtils<Person>();
	}
	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	
	@Override
	public ArrayList<Person> filterField(String fieldName, String operator, Object value) {
		// TODO Auto-generated method stub
		return (ArrayList<Person>) utils.select(this.getPeople(), fieldName, operator, value);
	}

}
