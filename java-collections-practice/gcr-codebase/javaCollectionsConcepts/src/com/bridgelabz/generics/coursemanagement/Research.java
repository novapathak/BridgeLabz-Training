package com.bridgelabz.generics.coursemanagement;

public class Research extends CourseType {
	
	public Research (String name) {
		super(name);
	}
	
	@Override
	public void evaluate() {
		System.out.println(getCourse() + " evaluated by research");
	}

}
