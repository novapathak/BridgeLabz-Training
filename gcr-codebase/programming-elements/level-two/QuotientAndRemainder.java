import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaring variable
        int number1, number2;

        // Take input
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying result
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
    }
}
