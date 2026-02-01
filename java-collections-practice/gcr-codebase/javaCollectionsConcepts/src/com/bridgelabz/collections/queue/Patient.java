package com.bridgelabz.collections.queue;
import java.util.*;

class PatientM{
	String name;
	int severity;
	
	public PatientM(String name, int s) {
		this.severity = s;
		this.name = name;
	}
}
public class Patient {
	
	public static void main(String[]args) {
		
		PriorityQueue<PatientM> p = new PriorityQueue<>((a,b) -> b.severity - a.severity);
		 p.add(new PatientM("Nova", 3));
	        p.add(new PatientM("Pathak", 5));
	        p.add(new PatientM("Mahi", 2));

	        while (!p.isEmpty()) {
	            PatientM pq = p.remove();
	            System.out.println(pq.name + " treated (severity " + pq.severity + ")");
	        }
		
	}
	

}
