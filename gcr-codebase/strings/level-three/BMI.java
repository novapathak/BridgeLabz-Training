import java.util.Scanner;
public class BMICalculator {

    // Method to calculate BMI and status for one person
    public static String[] calculateBMIStatus(double weightKg, double heightCm) {

        // Convert height 
        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);

        //BMI status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return BMI and status
        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }
    // Method to compute BMI details for all persons
    public static String[][] computeBMIDetails(double[][] data) {
       
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display the BMI 
    public static void displayResult(String[][] data) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Compute BMI details
        String[][] bmiDetails = computeBMIDetails(personData);

        // Display result
        displayResult(bmiDetails);

        sc.close();
    }
}
