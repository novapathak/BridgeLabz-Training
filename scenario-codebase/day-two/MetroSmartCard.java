import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 100;  // Initial card balance

        while (balance > 0) {

            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance (km) or -1 to exit: ");
            int distance = sc.nextInt();

            // Exit option
            if (distance == -1) {
                System.out.println("Thank you for using Metro.");
                break;
            }

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 : 20;

            // Check sufficient balance
            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted.");
            } else {
                System.out.println("Insufficient balance.");
                break;
            }
        }
        sc.close();
    }
}
