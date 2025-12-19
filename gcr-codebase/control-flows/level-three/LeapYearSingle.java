//Creating Class with name LeapYearSingle

import java.util.Scanner;

public class LeapYearSingle {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

         //Display message to user
        System.out.print("Enter a year: ");
		
	    // Take year input from user
        int year = sc.nextInt();

        // Check condition
        if (year < 1582) {
            System.out.println("Leap Year is valid only for year 1582 or later.");
        } 
        // Single if condition using logical AND (&&) and OR (||)
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If year is divisible by 4 and not divisible by 100
            // OR if year is divisible by 400
            System.out.println("Year is a Leap Year");
        } 
        else {
            // If condition is false
            System.out.println("Year is not a Leap Year");
        }

    }
}
