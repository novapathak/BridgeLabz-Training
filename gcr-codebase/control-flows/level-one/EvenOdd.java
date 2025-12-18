//Creating Class with name EvenOdd
import java.util.Scanner;
public class EvenOdd {
public static void main(String args[]){

    //Creating input object
    Scanner sc = new Scanner(System.in);
	
	//Displaying message to user
	System.out.println("Enter number: ");
	
	//take input from user
	int number = sc.nextInt();
	
	//check if number is natural
	if(number<=0){
		System.out.println("Invalid");
		return;
	}
	for(int i=1;i<=number;i++){
		if(i%2==0){
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");
		}
	}
}
}
	
		
	
	