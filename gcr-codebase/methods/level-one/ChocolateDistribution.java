// Create method to find the number of chocolates each child gets and number of remaining chocolates
import java.util.Scanner;
public class ChocolateDistribution {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calling method 
        int[] result = findRemainderQuotient(numberOfChocolates, numberOfChildren);

        // Printing results
        System.out.println("Each child will get: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are: " + result[1]);
    }
    public static int[] findRemainderQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;   
        int remainingChocolates = number % divisor;  
		
        // Return result 
        return new int[] { chocolatesPerChild, remainingChocolates };
    }
}
