import java.util.Scanner;
public class Vote {
	
	public static void main(String args[]){
		
		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//Declare an Array
		int[]students = new int[10];
		
		//Display a message to user
		System.out.println("Enter age of all 10 students");
		
		//Loop for taking input
		for(int i=0; i<10; i++){
		//taking input
	    students[i] = sc.nextInt();
		if(students[i]>17){
		System.out.println("The student with the age "+ students[i] + " can vote.");
		}
		else{
		System.out.println("The student with the age "+ students[i] + " cannot vote.");
			}
		}
	}
}	
		
		