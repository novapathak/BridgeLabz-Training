//Creating Class with name FizzBuzz

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take number input from user
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {
        for (int i = 1; i <= number; i++) {
       
		// If number is divisible by both 3 and 5
        if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
        }
        // If number is divisible by 3
        else if (i % 3 == 0) {
        System.out.println("Fizz");
        }
        // If number is divisible by 5
        else if (i % 5 == 0) {
        System.out.println("Buzz");
        }
        // Otherwise print the number
        else {
        System.out.println(i);
        }
	}
 }
		else {
            System.out.println("Enter a positive integer");
        }
    }
}
