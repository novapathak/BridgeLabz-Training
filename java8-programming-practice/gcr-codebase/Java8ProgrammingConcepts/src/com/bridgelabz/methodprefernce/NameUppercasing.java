package com.bridgelabz.methodprefernce;
import java.util.*;
import java.util.stream.Collectors;
public class NameUppercasing {
	public static void main(String[]args) {
		
		List<String> s = new ArrayList<>();
		
		s.add("Nova");
		s.add("Adarsh");
		s.add("Kartik");
		s.add("Manya");
		
		List<String> result = s.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		result.forEach(System.out::println);

	}
}
