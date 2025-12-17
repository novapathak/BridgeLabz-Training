import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
        // Creating variable to initialise value 
        double number1, number2;

        // Taking Input from user
		System.out.print("Enter first number: ");
        number1 = sc.nextDouble();
		System.out.print("Enter second number: ");
        number2 = sc.nextDouble();
		
        // Calculating Values
        double addition = number1 + number2;
        double subtraction = number1 - number2;
    	double multiplication = number1 * number2;
        double division = number1 / number2;

        // Displaying Output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ number1 + " and " + number2 + " is "+ addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
