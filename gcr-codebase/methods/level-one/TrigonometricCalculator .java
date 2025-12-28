//Create Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.

import java.util.Scanner;
public class TrigonometricCalculator {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking angle input 
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling method 
        double[] result = calculateTrigonometricFunctions(angle);

        // Printing the results
        System.out.println("Sine of angle is: " + result[0]);
        System.out.println("Cosine of angle is: " + result[1]);
        System.out.println("Tangent of angle is: " + result[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results 
        return new double[] { sine, cosine, tangent };
    }
}
