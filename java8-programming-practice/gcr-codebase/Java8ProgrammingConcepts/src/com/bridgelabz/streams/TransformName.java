package com.bridgelabz.streams;

import java.util.*;

public class TransformName {
	public static void main(String[]args) {
		List<String> list = Arrays.asList("Nova", "Adarsh", "Kartik","Manya", "Mahi");
		
		list.stream().map(name -> name.toUpperCase()).sorted().forEach(System.out::println);
			
		
	}

}
