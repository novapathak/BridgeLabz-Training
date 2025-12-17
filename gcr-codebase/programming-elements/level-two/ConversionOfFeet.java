import java.util.Scanner;

public class ConversionOfFeet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare distance
        double distanceInFeet;

        // Take input from user
        System.out.print("Enter distance in feet: ");
        distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Displaying results
        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);
    }
}
