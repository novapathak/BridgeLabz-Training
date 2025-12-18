//Creating Class with name CountUsingFor indicating the purpose is to 
//Count down for
import java.util.Scanner;

public class CountUsingFor {
    public static void main(String[] args) {

        //Create a scanner object
		Scanner sc = new Scanner(System.in);

        //Display a message to user
		System.out.print("Enter countdown start number: ");
		
		// Taking user input
        int n = sc.nextInt();

        // For loop countdown
        for (int i = n; i >= 1; i--) {
            System.out.println(i); //Print output
        }

    }
}
