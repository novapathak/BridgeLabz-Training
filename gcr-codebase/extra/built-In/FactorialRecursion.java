import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to find factorial
    static int factorial(int n) {

        // Base condition
        if (n == 0)
            return 1;

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
		//Create scanner object
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int result = factorial(n); 

        System.out.println("Factorial is: " + result);
    }
}
