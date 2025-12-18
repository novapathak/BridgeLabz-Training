//Creating Class with name NaturalNumber indicating the purpose is to 
//Check the largest number 
import java.util.Scanner;
public class NaturalNumber {
	public static void main(String args[]){
		
	    //Create a scanner object
	    Scanner sc = new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
        
		//Checking if number is positive
		if(number>0){
		int result = number*(number+1)/2; //BODMAS Rule
		System.out.println("The sum of " + number + " natural numbers is " + result);
		}
		else{
		System.out.println("The number "+ number + " is not a natural number");
		}
	}
}

			