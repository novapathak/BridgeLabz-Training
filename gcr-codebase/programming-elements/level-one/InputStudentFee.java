import java.util.Scanner;
public class InputStudentFee {
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		//creating variables to take input
		int fee, discountPercent;
		
		//Taking input
		fee = sc.nextInt();
		discountPercent = sc.nextInt();
		
		
		//calculating total discount
		double discountedAmount = (fee*discountPercent)/100;
		
		//calculating price after discount
		int discountedPrice = (int)(fee-discountedAmount);
		
        //displaying the output
		System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedPrice);
	}
}