package com.bridgelabz.dsa.day07.eduresult;
import java.util.ArrayList;
public class EduResult {
	
	public static void main(String[]args) {
		
		ArrayList<Student>arr = new ArrayList<>();
		
		arr.add(new Student("Nova", 800, "Jabalpur" ));
		arr.add(new Student("Ashi", 900, "Jabalpur" ));
		arr.add(new Student("Adarsh", 1000, "Sihora" ));
		arr.add(new Student("Kartik", 80, "Sihora" ));
		arr.add(new Student("Amisha", 2000, "Bihar" ));
		arr.add(new Student("Dhanya", 80, "Bhopal" ));
		arr.add(new Student("Manya", 12, "Jabalpur" ));
		
		Sorting.sorting(arr, 0, arr.size()-1);
		 System.out.println("State-wise Rank List:");
	        int rank = 1;
	        for (Student s: arr) {
	            System.out.println("Rank " + rank + " → " + s);
	            rank++;
	        }
	}

}
