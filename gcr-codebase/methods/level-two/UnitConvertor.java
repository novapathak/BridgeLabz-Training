// Create methods for all the UnitConvertor class methods
import java.util.Scanner;
public class UnitConvertor {
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
	// Method to convert miles to kilometers
   public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
   }
	// Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    // Main method
    public static void main(String[] args) {
       //Scanner object to take input
	   Scanner sc = new Scanner(System.in);
        // Display a message to user
        System.out.print("Enter distance in kilometers: ");
	    // Taking input from user
        double km = sc.nextDouble();
       System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
          System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // print results
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
    }
}
