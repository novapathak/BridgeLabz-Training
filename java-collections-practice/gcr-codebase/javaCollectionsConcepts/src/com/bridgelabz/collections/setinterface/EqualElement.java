package com.bridgelabz.collections.setinterface;
import java.util.Set;
import java.util.HashSet;
public class EqualElement {
	
	public static void main(String[]args) {

	Set<Integer> s = new HashSet<>();
	s.add(5);
	s.add(10);
	s.add(15);
	
	Set<Integer> ss = new HashSet<>();
	ss.add(89);
	ss.add(32);
	ss.add(78);
	
	boolean result = s.equals(ss);
	System.out.println("Are both sets are equal? "+ result);
	
}
}
