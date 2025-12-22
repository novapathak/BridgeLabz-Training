//Create method to calculate BMI
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }
    calculateBMI(data);
    }

    public static void calculateBMI(double[][] data) {
         for (int i = 0; i < data.length; i++) {
            double heightMeter = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeter * heightMeter);
         System.out.println("BMI: " + data[i][2] + " Status: " + getStatus(data[i][2]));
        }
    }

    public static String getStatus(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		}
        else if (bmi < 25){
			return "Normal";
		}
        else if (bmi < 30){
			return "Overweight";
		}
        else {
			return "Obese";
		}
    }
}
