import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare base and height 
        double base, height;

        // Take input from user
        System.out.print("Enter base ");
        base = sc.nextDouble();

        System.out.print("Enter height ");
        height = sc.nextDouble();

        // Calculate area
        double areaCm = 0.5 * base * height;

        // Convert square centimeters to square inches
        double areaIn = areaCm / (2.54 * 2.54);

        // Display result
        System.out.println("The Area of the triangle in sq in is " + areaIn +
                " and sq cm is " + areaCm);
    }
}
