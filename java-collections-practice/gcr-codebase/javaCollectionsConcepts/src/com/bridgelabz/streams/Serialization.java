package com.bridgelabz.streams;
import java.io.*;
import java.util.*;

public class Serialization {
	
	
	public static void main(String[]args) {
		
		List<Employee> list = new ArrayList<>();
	    list.add(new Employee(1, "CSE", "Adarsh", 200));
	    list.add(new Employee(2, "CSE", "Kartik", 150));
	    list.add(new Employee(3, "CSE", "Nova", 100));
	  
	    try {
	    	ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/com/bridgelabz/streams/input.txt"));
	    	o.writeObject(list);
	    	o.close();
	    	System.out.println("Employess serialized succesfully");
	    }
	    catch(IOException e) {
	    	System.out.println("Error");
	    }
	}

}
