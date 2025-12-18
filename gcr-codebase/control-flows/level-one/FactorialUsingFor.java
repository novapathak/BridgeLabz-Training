//Creating Class with name FactorialUsingLoop indicating the purpose is to 
//Find factorial using for
import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {

         //Create a scanner object
		Scanner sc = new Scanner(System.in);

        //Display message to user
		System.out.print("Enter a positive integer: ");
		
		//Take input from user
        int n = sc.nextInt();

        //Check if number is positive or not 
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        int factorial = 1;

        // For loop factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
