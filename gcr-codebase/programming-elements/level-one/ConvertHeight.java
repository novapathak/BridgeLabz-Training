import java.util.Scanner;
public class ConvertHeight {
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
	//creating varibale to take input
		int heightInCm;
		double heightInFeet, heightInInches;
		
	//Taking input
		heightInCm = sc.nextInt();
		
	//converting height into Feet and Inches
		heightInInches = heightInCm / 2.54;
		heightInFeet = heightInInches/12;
		
    //Displaying output
	System.out.println("Your Height in cm is " + heightInCm + " while in feet is "+ heightInFeet + " and inches is " + heightInInches);
		
	}
}