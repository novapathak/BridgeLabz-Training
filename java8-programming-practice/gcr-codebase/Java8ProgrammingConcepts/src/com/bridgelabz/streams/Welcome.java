package com.bridgelabz.streams;

import java.util.*;

public class Welcome {
	
	public static void main(String[]args) {
		List<String> list = Arrays.asList("Nova", "Adarsh", "Kartik");
		list.forEach(x -> 
		System.out.println("Welcome: " + x)
		);
	}

}
