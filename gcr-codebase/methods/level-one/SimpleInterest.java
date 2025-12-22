// Create method to calculate Simple Interest
import java.util.*;
public class SimpleInterest{
	public static void main(String args[]){
	
	//Create scanner object 
	Scanner sc = new Scanner(System.in);
	
	//Decalre variable to take input
	double si;
	System.out.println("Enter amount of principal:");
	int principal = sc.nextInt();
	System.out.println("Enter rate:");
	double rate = sc.nextDouble();
	System.out.println("Enter time:");
	double time = sc.nextDouble();
    //Calling method
	SimpleInterest obj = new SimpleInterest();
	si = obj.simpleInterest(principal, rate,time);
	System.out.println("The Simple Interest is " + si +" for Principal "+ principal + ", Rate of Interest "+ rate + " and Time "+time);
	}
	
	
	
	//Create Method
    public double simpleInterest(int p, double r, double t){
		
	//perform calculation
	double si = (p*r*t)/100;
	return si;
	
	}
}

	

	