import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");

            int currency = sc.nextInt();
            double convertedAmount = 0;

            // Switch to apply correct exchange rate
            switch (currency) {
                case 1:
                    convertedAmount = inr * 0.012; // INR to USD
                    System.out.println("Amount in USD: " + convertedAmount);
                    break;
                case 2:
                    convertedAmount = inr * 0.011; // INR to EUR
                    System.out.println("Amount in EUR: " + convertedAmount);
                    break;
                case 3:
                    convertedAmount = inr * 0.0095; // INR to GBP
                    System.out.println("Amount in GBP: " + convertedAmount);
                    break;
                default:
                    System.out.println("Invalid currency choice!");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
