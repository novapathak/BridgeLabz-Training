import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();   

        System.out.println("In Celsius: " + toCelsius(temp));
        System.out.println("In Fahrenheit: " + toFahrenheit(temp));
    }
}
