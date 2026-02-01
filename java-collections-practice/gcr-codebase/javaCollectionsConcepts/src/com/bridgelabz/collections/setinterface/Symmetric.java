package com.bridgelabz.collections.setinterface;
import java.util.Set;
import java.util.TreeSet;
public class Symmetric {
	public static void main(String[]args) {
		
		Set<Integer> S = new TreeSet<>();
		S.add(1);
		S.add(2);
		S.add(3);
		Set<Integer> SS = new TreeSet<>();
		SS.add(3);
		SS.add(4);
		SS.add(5);
		
		Set<Integer> union = new TreeSet<>(S);
		union.addAll(SS);
		Set<Integer> intersection = new TreeSet<>(S);
		intersection.retainAll(SS);
		union.removeAll(intersection);
		System.out.println("S: " + S);
		System.out.println("SS: " + SS);
		System.out.println("Symmetric Difference: " + union);
//		Collections.sort(S);
	}

}
