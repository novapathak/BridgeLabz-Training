// Create class NumberCheckerFour that checks for prime, neon, spy, automorphic, and buzz numbers.

import java.util.Scanner;
public class NumberCheckerFour {
	 public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check and display number properties
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));
        
        // Close the scanner stream
        sc.close();
    }

    // Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // Check divisibility up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        // Return true if no divisors found
        return true;
    }

    // Check if number is a Neon number 
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        return sum == n;
    }

    // Check if number is a Spy number 
    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        // Calculate sum and product of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        // Return true if sum equals product
        return sum == product;
    }

    // Check if number is automorphic 
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String sNum = String.valueOf(n);
        String sSquare = String.valueOf(square);
		
        return sSquare.endsWith(sNum);
    }

    // Check if number is a Buzz number 
    public static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }
   
}