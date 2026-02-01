package com.bridgelabz.collections.queue;
import java.util.*;
public class ReverseQueue {
	
	public static void reverseQueue(Queue<String> q) {
		if(q.isEmpty()) {
			return;
		}
		
		String x = q.remove();
		reverseQueue(q);
		q.add(x);
	}
		
	public static void main(String[]args) {
	
	Queue<String> q = new LinkedList<>();

	q.add("A");
	q.add("B");
    q.add("C");
    q.add("D");
    
    reverseQueue(q);
    System.out.println(q);
    
    }
}
    
    
    