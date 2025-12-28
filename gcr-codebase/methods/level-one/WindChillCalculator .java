// Create method to calculate the wind chill temperature
import java.util.Scanner;
public class WindChillCalculator {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        // Calling method 
        double windChill = calculateWindChill(temperature, windSpeed);

        // Print Result
        System.out.println("Wind Chill Temperature is: " + windChill);
    }

    
    public static double calculateWindChill(double temperature, double windSpeed) {

       
        double windChill = 35.74+ 0.6215 * temperature + (0.4275 * temperature - 35.75 * Math.pow(windSpeed, 0.16);

        // Return Result
        return windChill;
    }
}
