import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // GST percentage
        final double GST_RATE = 0.05; // 

        while (true) {
            System.out.println("Enter coffee type or type 'exit' to stop:");
            String coffeeType = sc.next().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café ☕");
                break;
            }
            double pricePerCup = 0;
			
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:// skip this iteration
            }
            // Ask for quantity
            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            // total price
            double totalPrice = pricePerCup * quantity;
            // Calculate GST
            double gstAmount = totalPrice * GST_RATE;
            // Final amount
            double finalBill = totalPrice + gstAmount;
            // Display bill details
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Base Price: ₹" + totalPrice);
            System.out.println("GST (5%): ₹" + gstAmount);
            System.out.println("Total Bill: ₹" + finalBill);
        }
       
        sc.close();
    }
}
