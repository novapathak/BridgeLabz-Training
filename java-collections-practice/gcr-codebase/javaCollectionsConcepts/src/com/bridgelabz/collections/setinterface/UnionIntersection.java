package com.bridgelabz.collections.setinterface;
import java.util.HashSet;
import java.util.Set;
public class UnionIntersection {
public static void main(String[]args) {
	Set<Integer> s = new HashSet<>();
	Set<Integer> ss = new HashSet<>();
	s.add (1);
	s.add (2);
	s.add (3);
	s.add (4);
    s.add (5);
    
    ss.add (3);
    ss.add (4);
    ss.add (5);
    ss.add (6);
    ss.add (7);
    
    Set<Integer> union = new HashSet<>(s);
    Set<Integer> intersection = new HashSet<>(s);
    
    union.addAll(ss);
    intersection.retainAll(ss);
    
    System.out.println("Set 1 "+ s);
    System.out.println("Set 2 "+ ss);
    System.out.println("Union "+ union);
    System.out.println("intersection "+ intersection);
    
    
    
    
    
}
}