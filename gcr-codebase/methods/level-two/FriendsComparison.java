// Create method to find youngest and tallest friend
import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {
        //Create scanner object
		Scanner sc = new Scanner(System.in);
     int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }
		System.out.println("Youngest is: " + names[findYoungest(age)]);
        System.out.println("Tallest is: " + names[findTallest(height)]);
    }
    public static int findYoungest(int[] age) {
        int minIndex = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
	public static int findTallest(double[] height) {
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
