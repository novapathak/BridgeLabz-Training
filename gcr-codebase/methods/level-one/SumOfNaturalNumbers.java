// Create Method to find the sum of n natural numbers using loop 
import java.util.Scanner;
public class SumOfNaturalNumbers {
    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Display a message to user
        System.out.print("Enter a number: ");
		
		//Take input
        int n = sc.nextInt();

        // Call method
        int result = sumOfNumbers(n);

        // Print the result
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    // Method to find sum of n natural numbers using loop
    public static int sumOfNumbers(int n) {

        int sum = 0; // Variable to store sum

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum = sum + i; 
        }

        // Return result
        return sum;
    }
}
