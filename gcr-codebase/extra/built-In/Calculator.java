import java.util.Scanner;

public class Calculator {

    // Addition method
    static int add(int a, int b) {
        return a + b;
    }
    // Subtraction method
    static int subtract(int a, int b) {
        return a - b;
    }
    // Multiplication method
    static int multiply(int a, int b) {
        return a * b;
    }
    // Division method
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
		// Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();        
        int b = sc.nextInt();          
        char choice = sc.next().charAt(0);

        // Perform operation based on choice
        switch (choice) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(subtract(a, b)); break;
            case '*': System.out.println(multiply(a, b)); break;
            case '/': System.out.println(divide(a, b)); break;
            default: System.out.println("Invalid operation");
        }
    }
}
