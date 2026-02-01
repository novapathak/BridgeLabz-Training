package com.bridgelabz.generics.resumescreening;

public class SE extends JobRole{
	
	public SE (String name) {
		super(name);
	}
	
	@Override
	public void display() {
		System.out.println(getName() + " screened for Software Engineer");
	}

}
