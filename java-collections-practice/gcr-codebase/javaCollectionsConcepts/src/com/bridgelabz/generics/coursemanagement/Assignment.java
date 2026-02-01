package com.bridgelabz.generics.coursemanagement;

public class Assignment extends CourseType {
	public Assignment (String name) {
		super(name);
	}
	
	@Override
	public void evaluate(){
		System.out.println(getCourse() + " evaluated by assignment");
	}

}
