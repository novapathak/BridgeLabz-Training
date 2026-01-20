package com.bridgelabz.practicequestion;
import java.util.*;
public class SampleProgramOne {
	public static String cleanseAndInvert(String input) {
		
		if(input == null || input.length()<6) {
			return "";
		}
		
		for(char ch : input.toCharArray()) {
			if(!Character.isLetter(ch)) {
				return "";		
				}
		}
		 for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char)(ch + 32);
	             
	            }
	        }
		
		
		StringBuilder s = new StringBuilder();
		for(char ch : input.toCharArray()) {
			if(ch % 2 != 0) {
				s.append(ch);
			}
		}
		int start = 0;
		int end = s.length()-1;
		while(start <end) {
			char temp = s.charAt(start);
			s.setCharAt(start,s.charAt(end));
			s.setCharAt(end, temp);
			start++;
			end--;
			
		}
		
		for(int i = 0; i< s.length(); i++) {
			if( i % 2 == 0) {
				s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
		}
		return s.toString();
		
		
	}

}
