import java.util.Scanner;

public class ShopkeeperDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS = 5; // total items to input
        double totalBill = 0;

        // Input prices of items
        for (int i = 1; i <= NUM_ITEMS; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        double discount = 0;

        // Discount logic using if-else
        if (totalBill >= 500) {
            discount = 0.20 * totalBill; // 20% discount
        } else if (totalBill >= 200) {
            discount = 0.10 * totalBill; // 10% discount
        } else {
            discount = 0; // no discount
        }

        double finalBill = totalBill - discount;

        System.out.println("\nTotal Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + finalBill);

        sc.close();
    }
}
