//Creating Class with name EmployeeBonus
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        //Creating input object
        Scanner sc = new Scanner(System.in);

        // Take salary from user
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        //Display message to user
		System.out.print("Enter years of service: ");
		
		// Take years of service from user
        int years = sc.nextInt();

        // Declare a variable
		double bonus;

        // Check if service is more than 5 years
        if (years > 5) {
            bonus = salary * 0.05;   
        } else {
            bonus = 0;               
        }

        // Print bonus amount
        System.out.println("Bonus amount is: " + bonus);

 
    }
}
