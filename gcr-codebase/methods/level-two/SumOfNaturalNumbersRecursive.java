import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {

    // Method to find sum using recursion
    public static int sumRecursive(int n) {
        if (n == 1) { 
            return 1;
        }
        return n + sumRecursive(n - 1); 
    }

    // Method to find sum using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            sc.close();
            return;
        }
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        // Display results
        System.out.println("\nSum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);

        // Compare 
        if (sumRec == sumForm) {
            System.out.println("Both results are equal. Calculation is correct!");
        } else {
            System.out.println("Results are different. Check calculations.");
        }

        sc.close();
    }
}
