package com.bridgelabz.generics.resumescreening;

public abstract class JobRole {
	
	private String name;
	
	public JobRole(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public abstract void display();
}
