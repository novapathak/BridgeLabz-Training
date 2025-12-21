import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of size 10
        double[] numbers = new double[10];

        // Variable to store sum
        double total = 0.0;

        // Index variable
        int index = 0;

        // Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
			//Takes input
            double value = sc.nextDouble();

            // Break if value is 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Loop to calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println("Number: " + numbers[i]);
            total = total + numbers[i];
        }

        // Display total
        System.out.println("Total = " + (int)total);
    }
}
