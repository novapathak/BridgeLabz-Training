import java.util.Scanner;

public class FeetToYards {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variable
        double distanceInFeet;

        // Take input from user
        System.out.print("Enter distance in feet: ");
        distanceInFeet = sc.nextDouble();

        // Convert feet to yards 
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles 
        double distanceInMiles = distanceInYards / 1760;

        // Display result
        System.out.println("The distance in yards is " + distanceInYards +
                " and the distance in miles is " + distanceInMiles);
    }
}
