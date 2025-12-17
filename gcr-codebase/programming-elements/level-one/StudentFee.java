public class StudentFee {
	public static void main(String args[]){
		
		//creating variables to assign value
		int fee = 125000, discountPercent = 10;
		
		//calculating total discount
		double discountedAmount = (fee*discountPercent)/100;
		
		//calculating price after discount
		int discountedPrice = (int)(fee-discountedAmount);
		
        //displaying the output
		System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedPrice);
	}
}
