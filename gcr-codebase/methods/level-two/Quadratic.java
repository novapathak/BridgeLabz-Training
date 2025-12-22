// Create methods to calculate quadratic calculation
import java.util.Scanner;
public class Quadratic {
 public static void main(String[] args) {
        //Create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
		//Method calling
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            for (double r : roots) {
                System.out.println("Root: " + r);
            }
        }
    }
	//Method to perform calculation
	public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;
		double[] roots = new double[2];
        if (delta > 0) {
			roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
			roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
			roots[0] = -b / (2 * a);
			roots[1] = -b / (2 * a);
            return roots;
        }
		roots[0] = 0;
		roots[1] = 0;
        return roots;
    }
}
