import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variable to store perimeter
        double perimeter;

        // Take perimeter input from user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = sc.nextDouble();

        // Calculate side of the square
        double side = perimeter / 4;

        // Displaying result
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}
