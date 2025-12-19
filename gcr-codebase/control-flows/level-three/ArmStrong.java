//Creating Class with name PrimeNumber

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
		
		//Take input
        int number = sc.nextInt();

        // Store the original number 
        int originalNumber = number;

        // Variable to store sum 
        int sum = 0;

        // Loop until originalNumber becomes zero
        while (originalNumber != 0) {

            // Get the last digit
            int digit = originalNumber % 10;

            // Find the cube and add to sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit by dividing by 10
            originalNumber = originalNumber / 10;
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        
    }
}
