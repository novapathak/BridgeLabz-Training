import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variable 
        double perimeter;

        // Input perimeter from user
        System.out.print("Enter perimeter of square: ");
        perimeter = sc.nextDouble();

        // Calculate side of square
        double side = perimeter / 4;

        // Displaying result
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}
