import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Loop from 1 to 10 and store result in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the result from array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

	
	