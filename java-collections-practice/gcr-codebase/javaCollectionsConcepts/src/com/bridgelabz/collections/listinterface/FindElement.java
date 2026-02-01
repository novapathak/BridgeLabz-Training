package com.bridgelabz.collections.listinterface;
import java.util.*;
public class FindElement {
	public static void main(String[]args) {
		
		LinkedList<String> ll = new LinkedList<>();
		int N = 2;
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
	    ll.add("D");
        ll.add("E");
        
        Iterator<String> first = ll.iterator();
        Iterator<String> second = ll.iterator();
        
        for(int i = 0; i < N; i++) {
        	if(!first.hasNext()) {
        		System.out.println("N is larger than the list size");
        		return;
        	}
        	first.next();
        }
        while(first.hasNext()) {
        	first.next();
        	second.next();
        }
        System.out.println("Nth from end is: "+ second.next());
	}
}      