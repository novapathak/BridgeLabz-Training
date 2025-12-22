// Create Method to find the reminder and the quotient of a number
import java.util.Scanner;
public class QuotientRemainder {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input 
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calling method 
        int[] result = findRemainderQuotient(number, divisor);

        // Print Result
        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);
    }
    public static int[] findRemainderQuotient(int number, int divisor) {

        int quotient = number / divisor;   
        int remainder = number % divisor;  

        // Return quotient and remainder as an array
        return new int[] { quotient, remainder };
    }
}
