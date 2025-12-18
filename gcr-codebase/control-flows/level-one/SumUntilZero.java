//Creating Class with name SumUntilZero indicating the purpose is to 
//Sum Until Zero
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        //Create a scanner object
		Scanner sc = new Scanner(System.in);
        
		//Decalring Varibale
        double sum = 0.0;
        double number;

        // Taking input from user
        System.out.print("Enter a number: ");
        number = sc.nextDouble();

        // While loop
        while (number != 0) {
        sum = sum + number;
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        }

        System.out.println("Total sum = " + sum);
    }
}
