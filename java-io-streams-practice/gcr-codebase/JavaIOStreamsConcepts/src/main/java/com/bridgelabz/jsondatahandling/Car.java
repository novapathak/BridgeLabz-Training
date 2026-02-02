package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Carr {
	    public String brand;
	    public int price;

	    Carr(String brand, int price) {
	        this.brand = brand;
	        this.price = price;
	    }
	public static void main(String[]args) {
	ObjectMapper mapper = new ObjectMapper();
	Carr car = new Carr("Toyota", 1500000);
	String json;
	try {
		json = mapper.writeValueAsString(car);
		System.out.println(json);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}
	}
