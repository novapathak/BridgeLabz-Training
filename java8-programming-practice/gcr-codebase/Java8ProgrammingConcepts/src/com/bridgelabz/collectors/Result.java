package com.bridgelabz.collectors;
import java.util.*;
import java.util.stream.*;
class Student{
	String name;
	String grade;
	
	public Student(String name, String grade) {
	        this.name = name;
	        this.grade = grade;
	    }
}

public class Result {
	 public static void main(String[] args) {
	List<Student> students = Arrays.asList(
            new Student("Nova", "A"),
            new Student("Adarsh", "B"),
            new Student("Kartik", "A"),
            new Student("Riya", "C")
			 ); 
   Map<String,List<String>> m = students.stream().collect(Collectors.groupingBy
		   (x->x.grade, Collectors.mapping(s->s.name,
				   Collectors.toList())));
   
   m.forEach((grade,name)->
   System.out.println(grade +"-> "+ name));
     
}
}

