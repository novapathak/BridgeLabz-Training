//Creating Class with name LargestNumber indicating the purpose is to 
// check the largest number 
import java.util.Scanner;
public class LargestNumber {
	public static void main(String args[]){
		
	    //create a scanner object
	    Scanner sc = new Scanner(System.in);
		
		// Get 3 input values for number
		System.out.println("Enter first number: "); 
	    int number1 = sc.nextInt(); 
		System.out.println("Enter second number: "); 
	    int number2 = sc.nextInt(); 
		System.out.println("Enter third number: "); 
	    int number3 = sc.nextInt(); 

        //Checking the smallest number
		boolean answer = (number1>number2)&&(number1>number3) ? true : false;
		boolean result = (number2>number1)&&(number2>number3) ? true : false;
		boolean output = (number3>number2)&&(number3>number1) ? true : false;
        
        //Print result
        System.out.println("Is the first number the largest?  " + answer );
		System.out.println("Is the second number the largest?  " + result );
		System.out.println("Is the third number the largest?  " + output );
	}
}
		

		
		
