package com.bridgelabz.streams;
import java.util.*;
import java.util.stream.*;

class Doctor{
	String name;
	boolean availability;
	
	public Doctor(String name, boolean availability) {
		this.name = name;
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return name + "Doctor is available on "+availability;
	}
}
public class Hospital {
	public static void main(String[]args) {
		
		List<Doctor> list = Arrays.asList(
				new Doctor("Cardiologist",true),
				new Doctor("Neurologist",false),
				new Doctor("Orthologist",false),
				new Doctor("Dermatologist",false),
				new Doctor("gynaec",true),
				new Doctor("Dentist",true),
				new Doctor("Physio",false)			
				);
		list.stream().filter(d -> d.availability).sorted((d1,d2)-> d1.name.compareTo(d2.name)).forEach(System.out::println);
	}

}
