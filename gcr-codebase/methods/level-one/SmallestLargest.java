//create a single method to find the smallest and largest of the three numb
import java.util.Scanner;
public class SmallestLargest {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Display a message to user
        System.out.print("Enter first number: ");
		
		//take input
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Calling method 
        int[] result = findSmallestLargest(number1, number2, number3);

        // Print result
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }

    public static int[] findSmallestLargest(int number1, int number2, int number3) {

        int smallest = number1; 
        int largest = number1; 

        // Compare second number with smallest and largest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare third number with smallest and largest
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return 
        return new int[] { smallest, largest };
    }
}
