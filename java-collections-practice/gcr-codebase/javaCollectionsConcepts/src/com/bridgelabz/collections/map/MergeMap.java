package com.bridgelabz.collections.map;
import java.util.*;
public class MergeMap {
	 public static void main(String[] args) {

	        Map<String,Integer> m1 = new HashMap<>(Map.of("A",1,"B",2));
	        Map<String,Integer> m2 = Map.of("B",3,"C",4);

	        for (Map.Entry<String,Integer> e : m2.entrySet()) {
	            m1.merge(e.getKey(), e.getValue(), Integer::sum);
	        }

	        System.out.println(m1);
	    }

}
