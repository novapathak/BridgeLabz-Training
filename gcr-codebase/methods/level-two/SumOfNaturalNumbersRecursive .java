import java.util.Scanner;

// Creating a class named SumOfNaturalNumbersRecursive
public class SumOfNaturalNumbersRecursive {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        // Find sum using recursive method
        int recursiveSum = sumUsingRecursion(n);

        // Find sum using formula
        int formulaSum = sumUsingFormula(n);

        // Print results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }

    // recursion Method 
    public static int sumUsingRecursion(int n) {

        // Base condition
        if (n == 1) {
            return 1;
        }

        // Recursive call
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum of n natural numbers using formula
    public static int sumUsingFormula(int n) {

        // Apply formula n*(n+1)/2
        return n * (n + 1) / 2;
    }
}
