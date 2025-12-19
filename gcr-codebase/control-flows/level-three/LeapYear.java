//Creating Class with name LeapYear
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Display message to user
        System.out.print("Enter a year: ");
		
		//Take input
        int year = sc.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
        } 
        // Check if year is divisible by 400
        else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        // Check if year is divisible by 100
        else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
		}
	}
}

