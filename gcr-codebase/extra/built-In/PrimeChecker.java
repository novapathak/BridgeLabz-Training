import java.util.Scanner;

public class PrimeChecker {

    // This method checks if number is prime
    static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1)
            return false;

        // Check divisibility from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;  // number is prime
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // user input

        // Display result
        if (isPrime(num))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
