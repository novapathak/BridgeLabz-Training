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
		
		//Check if number is positive, negative or zero
		if(number>0){
		System.out.println("Positive");
		}
		else if(number<0){
			System.out.println("Negative");
		}
		else if(number==0){
			System.out.println("Zero");
		}
		
	}
}	



		
		