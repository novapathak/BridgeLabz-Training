//Creating Class with name FactorialUsingLoop indicating the purpose is to 
//Find factorial
import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {

        //Create a scanner object
		Scanner sc = new Scanner(System.in);

         //Display message to user
		System.out.print("Enter a positive integer: ");
		
		//Take input from user
        int n = sc.nextInt();

        // Check positive integer
        if (n < 0) {
            System.out.println("Invalid");
            return;
        }

        int factorial = 1;
        int i = 1;

        // While loop
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
