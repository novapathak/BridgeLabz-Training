import java.util.Scanner;

public class TemperatureLogger {

    // Method to calculate average temperature
    static double calculateAverage(int[] temperatures) {
        int sum = 0;

        for (int temp : temperatures) {
            sum += temp;
        }

        return (double) sum / temperatures.length;
    }

    // Method to find maximum temperature
    static int findMaxTemperature(int[] temperatures) {
        int max = temperatures[0];

        for (int temp : temperatures) {
            if (temp > max) {   // if current temperature is greater than max
                max = temp;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temperatures = new int[7]; // array to store 7 days temperature

        // Taking temperature input for 7 days
        for (int day = 0; day < 7; day++) {
            System.out.print("Enter temperature for day " + (day + 1) + ": ");
            temperatures[day] = sc.nextInt();
        }

        // Calling methods
        double averageTemp = calculateAverage(temperatures);
        int maxTemp = findMaxTemperature(temperatures);

        // Displaying results
        System.out.println("\nAverage Temperature: " + averageTemp);
        System.out.println("Maximum Temperature: " + maxTemp);

        sc.close();
    }
}
