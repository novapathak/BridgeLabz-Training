package com.bridgelabz.generics.coursemanagement;

public class Exam extends CourseType {
	
	public Exam (String name) {
		super(name);
	}
	
	@Override
	public void evaluate() {
		System.out.println(getCourse() + "Evaluated by exam");
	}

}
