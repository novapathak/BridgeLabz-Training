package com.bridgelabz.collections.map;
import java.util.*;
public class HighestValue {
	 public static void main(String[] args) {

	        Map<String,Integer> map = Map.of("A",10,"B",20,"C",15);

	        String maxKey = null;
	        int maxVal = Integer.MIN_VALUE;

	        for (Map.Entry<String,Integer> e : map.entrySet()) {
	            if (e.getValue() > maxVal) {
	                maxVal = e.getValue();
	                maxKey = e.getKey();
	            }
	        }

	        System.out.println(maxKey);
	    }

}
