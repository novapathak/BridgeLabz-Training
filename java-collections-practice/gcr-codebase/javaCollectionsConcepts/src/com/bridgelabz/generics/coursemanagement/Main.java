package com.bridgelabz.generics.coursemanagement;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
		
		List<Exam> exam = new ArrayList<>();
		exam.add(new Exam("Mathematics"));
		exam.add(new Exam("Physics"));
		CourseWildCard.display(exam);
		
		List<Research> research = new ArrayList<>();
		research.add(new Research("Mathematics"));
		research.add(new Research("Physics"));
		CourseWildCard.display(research);
	}

}
