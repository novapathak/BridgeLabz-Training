//Method to compute the number of rounds user needs to do to complete 5km run
import java.util.*;
public class TriangularPark {
	public static void main(String args[]){
	
	//Create scanner object 
	Scanner sc = new Scanner(System.in);
	
	//Display a message to user
	System.out.println("Enter 3 sides of Triangle: ");
	double side1 = sc.nextDouble();
	double side2 = sc.nextDouble();
	double side3 = sc.nextDouble();
	double rounds = triangularPark(side1, side2, side3);
	System.out.println("The number of rounds athelete must complete to cover 5km is "+rounds);
	
	
	}
	
	public static double triangularPark(double s1, double s2, double s3){
		double perimeter = s1+s2+s3;
		double result = 5000/perimeter;
		return result;
		
	}
}
		
		