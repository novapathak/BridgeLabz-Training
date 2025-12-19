//Creating Class with name Calculator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get weight in kg
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Get height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI: weight / (height * height)
        double bmi = weight / (heightMeters * heightMeters);

        // Determine status based on BMI table
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi < 25.0) { 
            status = "Normal";
        } else if (bmi < 40.0) { 
            status = "Overweight";
        } else { // >= 40.0
            status = "Obese";
        }

        // Display result
        System.out.println("Your BMI is " + bmi + " and your status is " + status);

       
    }
}