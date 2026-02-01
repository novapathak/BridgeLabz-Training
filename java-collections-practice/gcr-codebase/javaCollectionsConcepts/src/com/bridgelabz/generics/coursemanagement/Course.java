package com.bridgelabz.generics.coursemanagement;

public class Course<T extends CourseType> {
	
	private T courseName;
	
	public Course(T CourseName) {
		this.courseName = courseName;
	}
	public T getCourse() {
		return courseName;
	}
	

}
