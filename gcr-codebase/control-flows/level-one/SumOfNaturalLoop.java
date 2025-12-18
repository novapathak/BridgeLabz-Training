//Creating Class with name SumOfNatural indicating the purpose is to 
//Sum of natural number using loop
import java.util.Scanner;

public class SumOfNaturalLoop {
    public static void main(String[] args) {

        //Create a scanner object
		Scanner sc = new Scanner(System.in);

        //Display message to user
		System.out.print("Enter a natural number: ");
        
		//Take imput from user
		int n = sc.nextInt();

        // Check natural number
		if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum= 0;

        // For loop calculation
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
		//Using formula
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop = " + sum);
        System.out.println("Sum using formula = " + sumFormula);

        if (sum == sumFormula) {
            System.out.println("Both computations are correct");
        }
    }
}
