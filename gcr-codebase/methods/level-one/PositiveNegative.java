//Creating Class with name PositiveNegative indicating the purpose is to 
//Check if the person is eligible to vote 
import java.util.Scanner;
public class PositiveNegative {
	public static void main(String args[]){
		
	    //Create a scanner object
	    Scanner sc = new Scanner(System.in);
		
		//Taking Input from user
        System.out.println("Enter your number: ");		
		double number = sc.nextDouble();
		String answer = positiveNegative(number);
		System.out.println("Entered number is "+answer); 
		
	}
		//Method to Check if number is positive, negative or zero
		public static String positiveNegative(double number){
		if(number>0){
		return "Positive";
		}
		else if(number<0){
		return "Negative";

		}
		else {
		return "Zero";

		}
		
	}
}	



		
		