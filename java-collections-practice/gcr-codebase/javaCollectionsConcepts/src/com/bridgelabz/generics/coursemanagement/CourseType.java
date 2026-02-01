package com.bridgelabz.generics.coursemanagement;

public abstract class CourseType {
	
	private String courseName;
	
	public CourseType(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourse() {
		return courseName;
	}
	
public abstract void evaluate();
}
