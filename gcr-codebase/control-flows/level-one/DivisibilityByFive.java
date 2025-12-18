// Creating Class with name DivisibilityByFive indicating the purpose is to 
// check if the number is divisible by 5
import java.util.Scanner;
public class DivisibilityByFive {
	public static void main(String args[]){
		      
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);
		
		//Display message to user
		System.out.println("Enter a number: ");
		
		//Taking input from user
		int number = sc.nextInt();
		
	    //Check if number is divisible by 5
		if(number%5==0) {
			System.out.println("Is the number " + number + "divisible by 5?" + " YES!");
		}
		else{
			System.out.println("Is the number " + number + "divisible by 5?" + " NO!");
		}
	}
}
			

		
			
			