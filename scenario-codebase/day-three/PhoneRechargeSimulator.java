import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        String choice;

        do {
            System.out.print("Enter Mobile Operator : ");
            String operator = sc.next();
            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            // Display offers based on operator
            switch (operator.toUpperCase()) {
                case "A":
                    System.out.println("Operator A: Get 10% extra balance!");
                    balance += amount + (0.10 * amount);
                    break;
                case "B":
                    System.out.println("Operator B: Get 20% extra talktime!");
                    balance += amount + (0.20 * amount);
                    break;
                case "C":
                    System.out.println("Operator C: No extra offers.");
                    balance += amount;
                    break;
                default:
                    System.out.println("Invalid operator! No recharge done.");
            }

            System.out.println("Current Balance: " + balance);

            // Ask if user wants to recharge again
            System.out.print("Do you want to recharge again? : ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Thank you! Your final balance is: " + balance);
        sc.close();
    }
}
