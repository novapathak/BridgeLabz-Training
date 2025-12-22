// Create method to find the sum of square of the factors using Math.pow() method

import java.util.Scanner;
public class FactorsOfNumber {

    // Main method
    public static void main(String[] args) {
        // Create Scanner object 
        Scanner sc = new Scanner(System.in);
      // Take input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Call method
        int[] factors = findFactors(number);
        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
        System.out.print(factors[i] + " ");
        }
        System.out.println();
     // Call methods 
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double sumOfSquares = findSumOfSquaresOfFactors(factors);

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create array 
        int[] factors = new int[count];
		int index = 0;
        // Second loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
		return sum;
    }
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
		return product;
    }
    public static double findSumOfSquaresOfFactors(int[] factors) {
    double sumOfSquares = 0;
	for (int i = 0; i < factors.length; i++) {
            sumOfSquares = sumOfSquares + Math.pow(factors[i], 2);
        }
    return sumOfSquares;
    }
}
