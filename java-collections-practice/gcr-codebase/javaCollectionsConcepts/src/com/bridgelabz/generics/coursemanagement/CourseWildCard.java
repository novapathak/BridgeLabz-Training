package com.bridgelabz.generics.coursemanagement;
import java.util.List;
public class CourseWildCard {
	
	public static void display(List<? extends CourseType>course) {
		for(CourseType c : course) {
			c.evaluate();
		}
	}

}
