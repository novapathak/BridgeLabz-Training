// Create methods for all the UnitConvertor class methods
import java.util.Scanner;

public class UnitConvertor {

  // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
     double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
    return fahrenheit2celsius;
    }
 // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
    return celsius2fahrenheit;
    }
 // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
    return pounds * pounds2kilograms;
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
      double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method 
    public static void main(String[] args) {
        //Create scanner object
		Scanner sc = new Scanner(System.in);
		//Display a message 
        System.out.print("Enter temperature in Fahrenheit: ");
		// Taking user input
        double f = sc.nextDouble();
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
          System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
		System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();
		System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
		System.out.print("Enter volume in liters: ");
     double liters = sc.nextDouble();

        //printing results
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(f));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(c));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kg));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
