//Creating Class with name CountDigits

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Display message to user
        System.out.print("Enter a number: ");
		//Take input
        int originalNumber = sc.nextInt();
        
        // Handle negative numbers
        int number = Math.abs(originalNumber);
        
        // Variable to store count
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                // Remove last digit
                number = number / 10;
                count++;
            }
        }

        // Display result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

    }
}