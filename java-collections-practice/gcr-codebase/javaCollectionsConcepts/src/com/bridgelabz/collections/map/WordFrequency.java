package com.bridgelabz.collections.map;
import java.util.*;
public class WordFrequency {
	
	
	    public static void main(String[] args) throws Exception {

	    	
	    	String text = "Hello World This, is Nova Pathak!!";
	    	text = text.toLowerCase().replaceAll("[^a-z]","");
	    	String[] words = text.split("\\s+");
	    	Map<String, Integer> m = new HashMap<>();
	    	for (String n: words) {
	    		m.put(n, m.getOrDefault(n, 0) +1);
	    	}
	    	
	    
	        /*String text = "Hello world, hello Java!";
	        text = text.toLowerCase().replaceAll("[^a-z ]", "");

	        String[] words = text.split("\\s+");
	        Map<String, Integer> freq = new HashMap<>();
	        for (String w : words) {
	            freq.put(w, freq.getOrDefault(w, 0) + 1);
	        }
	        */
	        

	        System.out.println(m);
	    }
	}


