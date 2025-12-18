//Creating Class with name SumUntilZeroBreak indicating the purpose is to 
//Sum Until Zero using break
import java.util.Scanner;

public class SumUntilZeroBreak {
    public static void main(String[] args) {
       
	   //Create a scanner object
        Scanner sc = new Scanner(System.in);
		
		//Declare Variable
         double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Break condition
            if  (num <= 0) {
                break;
            }
            total = total + num;
        }

        System.out.println("Total sum = " + total);
    }
}
