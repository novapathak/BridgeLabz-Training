import java.util.Scanner;

public class IllegalArgument {

    // Method for generating IllegalArgumentException
    public static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    // Method that handles IllegalArgumentException
    public static void handleException(String text) {
        try {
            
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);

        } catch (IllegalArgumentException e) {
            // Handles IllegalArgumentException
            System.out.println("IllegalArgumentException caught: Start index is greater than end index");

        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling method that generates exception
        System.out.println("\nCalling method that generates exception:");
        try {
            generateException(input);
        } catch (Exception e) {
            // Prevent program from stopping
            System.out.println("Program stopped due to runtime exception");
        }

        // Calling method that handles exception
        System.out.println("\nCalling method that handles exception:");
        handleException(input);

      
    }
}
