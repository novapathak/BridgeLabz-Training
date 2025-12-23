import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sin, cos, and tan
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        //Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine value: " + result[0]);
        System.out.println("Cosine value: " + result[1]);
        System.out.println("Tangent value: " + result[2]);

        sc.close();
    }
}
