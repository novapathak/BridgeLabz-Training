//Creating Class with name SmallestNumber indicating the purpose is to 
// check the smallest number among three number

import java.util.Scanner;
public class SmallestNumber {
	public static void main(String args[]){
		
	    //create a scanner object
	    Scanner sc = new Scanner(System.in);
		
	    // Get 3 input values for number
	    int number1 = sc.nextInt(); 
	    int number2 = sc.nextInt(); 
	    int number3 = sc.nextInt(); 

        //Checking the smallest number
		boolean answer = (number1<number2)&&(number1<number3) ? true : false;
        
        //Print result
        System.out.println("Is the first number the smallest? " + answer );
	}
}
		

		
		