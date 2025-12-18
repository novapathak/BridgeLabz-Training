//Creating Class with name CountWhile indicating the purpose is to 
//Count down while
import java.util.Scanner;
public class CountWhile {
    public static void main(String[] args) {
		
	    //Create a scanner object
         Scanner sc = new Scanner(System.in);
        
		//Display a message to user
         System.out.print("Enter countdown start number: ");      
	    
		// Taking user input
         int counter = sc.nextInt();

        // While loop for countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement
        }
    }
}
