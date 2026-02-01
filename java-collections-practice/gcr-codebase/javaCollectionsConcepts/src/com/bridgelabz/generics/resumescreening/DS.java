package com.bridgelabz.generics.resumescreening;

public class DS extends JobRole{
	public DS (String name) {
		super(name);
	}
	
	@Override
	public void display() {
		System.out.println(getName()+ " screened for Data Scientist Role");
	}
	

}
