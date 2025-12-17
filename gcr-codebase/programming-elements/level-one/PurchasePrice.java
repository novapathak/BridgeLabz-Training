import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variables
        double unitPrice;
        int quantity;

        // Take unit price input
        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();

        // Take quantity input
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display total purchase price
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}
