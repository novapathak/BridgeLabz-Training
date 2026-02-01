package com.bridgelabz.generics.resumescreening;

public class PM extends JobRole{
 
	public PM (String name) {
		super(name);
	}
	
	@Override
	public void display() {
		System.out.println(getName() + " screened for Product Managerr");
	}
}
