import java.util.Scanner;
public class KilometerToMiles {
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		//creating variables for input and taking input
		double km = sc.nextDouble();
		
		// computing miles
		double miles = km*1.6;
		
		// dispalying output
		System.out.println(" The total miles is " +miles+ " mile for the given " + km +"km");
	}
}

		
		
		