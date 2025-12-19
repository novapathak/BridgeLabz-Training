//Creating Class with name CalSwitch

import java.util.Scanner;

public class CalSwitch {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Get second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0;
        boolean validOp = true;

        // Switch case based on operator
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero.");
                    validOp = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOp = false;
        }

        // Print result
        if (validOp) {
            System.out.println("Result: " + result);
        }

        
    }
}