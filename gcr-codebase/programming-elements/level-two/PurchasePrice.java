import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variables
        double unitPrice;
        int quantity;

        // Input unit price and quantity
        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        // Calculate price
        double totalPrice = unitPrice * quantity;

        // Displaying purchase price
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}
