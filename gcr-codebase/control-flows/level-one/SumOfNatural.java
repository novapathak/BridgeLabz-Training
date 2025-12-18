//Creating Class with name SumOfNatural indicating the purpose is to 
//Sum of natural number 
import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        
		//Create a scanner object
        Scanner sc = new Scanner(System.in);

        //Display message to user
		System.out.print("Enter a natural number: ");
        
		//Take imput from user
		int number = sc.nextInt();

        // Check natural number
        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;
        int i = 1;

        // While loop calculation
        while (i <= number) {
            sum += i;
            i++;
        }

        // Formula calculation
        int sumFormula = number * (number + 1) / 2;

        // Output comparison
        System.out.println("Sum using while loop = " + sum);
        System.out.println("Sum using formula = " + sumFormula);

        if (sum == sumFormula) {
            System.out.println("Both computations are correct");
        }
    }
}
