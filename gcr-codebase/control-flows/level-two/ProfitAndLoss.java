public class ProfitAndLoss {
	public static void main (String args[]){
		
		//creating variable for values
		int sellingPrice =191, costPrice = 129;
		
		//creating variable to store output
		int profit = sellingPrice - costPrice;
        double profitPercentage = profit / costPrice * 100;
		
		//displaying the Answers
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +"\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage );
		
	}
}
