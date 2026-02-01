package com.bridgelabz.collections.listinterface;
import java.util.*;

class Frequency {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> m = new HashMap<>();
        for(String i: list) {
        	if(m.containsKey(i)) {
        		m.put(i, m.get(i)+1);
        	}
        	else {
        		m.put(i, 1);
        	}
        }
  
        System.out.println(m);
    }
}