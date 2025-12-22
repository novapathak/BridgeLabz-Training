//Create a program to find the maximum number of handshakes among students.
import java.util.*;
public class MaximumHandshakes{
	public static void main(String args[]){
		
	//Create scanner object 
	Scanner sc = new Scanner(System.in);
	
	//create variable to take input
	int numberOfStudents = sc.nextInt();
	int result = maximumHandShake(numberOfStudents);
	System.out.println(result);
	}
	
	public static int maximumHandShake(int n){
		int result = (n*(n-1))/2;
		return result;
	}
	}
	

		