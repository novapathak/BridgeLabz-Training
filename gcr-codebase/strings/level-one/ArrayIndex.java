import java.util.Scanner;

public class ArrayIndex {

    // Method that generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Name: " + names[names.length]);
    }
    // Method that handles ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index");

        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking number of names
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
		
        // Taking names input
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // Calling method that generates exception
        System.out.println("\nCalling method that generates exception:");
        try {
            generateException(names);
        } catch (Exception e) {
           
            System.out.println("Program stopped due to runtime exception");
        }

        // Calling method that handles exception
        System.out.println("\nCalling method that handles exception:");
        handleException(names);

        sc.close();
    }
}
