import java.util.Scanner;
public class NumberFormatException {
    // Method that generates NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    // Method that handles NumberFormatException
    public static void handleException(String text) {
        try {
            // Trying to convert text to integer
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);

        } catch (NumberFormatException e) 
            System.out.println("NumberFormatException caught: Text does not contain a valid number");

        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        //Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a text value: ");
        String input = sc.next();

        // Calling method to generate exception
        System.out.println("\nCalling method that generates exception:");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to runtime exception");
        }

        // Calling method that handles exception
        System.out.println("\nCalling method that handles exception:");
        handleException(input);

        sc.close();
    }
}
