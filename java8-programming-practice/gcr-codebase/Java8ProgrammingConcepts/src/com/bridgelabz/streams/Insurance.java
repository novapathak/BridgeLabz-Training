package com.bridgelabz.streams;
import java.util.stream.*;
import java.util.*;

class Claim{
	String name;
	double amount;
	
	public Claim(String n, double a) {
		this.name = n;
		this.amount = a;
	}
	

}
public class Insurance {
	public static void main(String[] args) {

		List<Claim> c = Arrays.asList(
			new Claim("Health",2000),
			new Claim("Vehicle",455),
			new Claim("Health",677899),
			new Claim("Vehicle",235907),
			new Claim("Home",1213),
			new Claim("Vehicle",543),
			new Claim("vehicle",2),
			new Claim("home",56)
				);
		
	Map<String, Double> m = c.stream().collect(Collectors.groupingBy(
			x -> x.name, Collectors.averagingDouble(x ->x.amount)));
	
	m.forEach((k,v) -> 
	System.out.println(k + " Average Claim: "+v));
}
}
