import java.util.Scanner;
public class PositiveNegative {
	public static void main(String args[]){
	//Create scanner object for input
	Scanner sc = new Scanner(System.in);
	
	//Declare an Array
	int[] numbers = new int[5];
		
	//Display a message to user
	System.out.println("Enter 5 numbers");
		
	//Loop for taking input
	for(int i=0; i<5; i++){
	//taking input
    numbers[i] = sc.nextInt();
	if(numbers[i]>0){
	System.out.println("Positive number ");
	if(numbers[i]%2==0){
		System.out.println("and Even.");
	}
	else{
		System.out.println("and Odd.");
	}
	}
	else if(numbers[i]<0){
	System.out.println("Negative Number ");
	}
	else{
	System.out.println("Zero ");
	}
		
	}
	String result = numbers[0]==numbers[4] ? "Equal" : (numbers[0]<numbers[4] ? "Less" : "Greater");
	System.out.println(result);
}
}
