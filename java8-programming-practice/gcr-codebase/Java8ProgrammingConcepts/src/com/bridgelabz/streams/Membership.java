package com.bridgelabz.streams;
import java.time.*;
import java.util.stream.*;
import java.util.*;

class Expiry{
	String name;
	LocalDate expiry;
	
	public Expiry(String name, LocalDate expiry) {
		this.name = name;
		this.expiry = expiry;
	}
	
 @Override
 public String toString() {
	 return name + " expires on "+ expiry;
 }
}
public class Membership {
	public static void main(String[]args) {
		
		List<Expiry> list = Arrays.asList(
		new Expiry("A",LocalDate.now().plusDays(10)),
		new Expiry("B",LocalDate.now().plusDays(40)),
		new Expiry("C",LocalDate.now().plusDays(20)),
		new Expiry("D",LocalDate.now().plusDays(1)),
		new Expiry("E",LocalDate.now().plusDays(14)));
		
		list.stream().filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30))).forEach(System.out::println);
				
	}

}
