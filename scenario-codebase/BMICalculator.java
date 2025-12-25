import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take height
        System.out.println("Enter height in meters:");
        double height = sc.nextDouble();
        // Take weight 
        System.out.println("Enter weight in kilograms:");
        double weight = sc.nextDouble();
        // Calculate BMI 
        double bmi = weight / (height * height);
        // Display BMI value
        System.out.println("Your BMI is: " + bmi);
        // Determine BMI category 
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

       
        sc.close();
    }
}
