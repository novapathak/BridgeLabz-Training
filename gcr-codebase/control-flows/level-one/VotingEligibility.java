//Creating Class with name VotingEligibility indicating the purpose is to 
//Check if the person is eligible to vote 
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String args[]){
		
	    //Create a scanner object
	    Scanner sc = new Scanner(System.in);
		
		// Displaying message to user
		System.out.println("Enter Your Age: ");
		
		//Taking input from user
		int age = sc.nextInt();
		
		//Check if person is eligible to vote or not
		if(age>=18){
		System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
		System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
}

			
			
		
		