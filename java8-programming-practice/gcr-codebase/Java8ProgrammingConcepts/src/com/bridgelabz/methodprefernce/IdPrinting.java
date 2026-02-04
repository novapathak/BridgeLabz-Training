package com.bridgelabz.methodprefernce;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class Patient{
	
	String name;
	int id;
	
	public Patient(String n, int i ) {
		this.name = n;
		this.id = i;
	}
	
	public void print() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
public class IdPrinting {
	public static void main(String[]args) {
		List<Patient> id = new ArrayList<>();
		id.add(new Patient("Nova", 3));
		id.add(new Patient("Adarsh", 1));
		id.add(new Patient("Kartik", 7));
		id.add(new Patient("Manya", 4));
		Collections.sort(id,(p1,p2) -> Integer.compare(p1.id, p2.id));
		id.forEach(Patient::print);
		
	}

}
