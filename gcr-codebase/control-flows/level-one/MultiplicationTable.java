//Creating Class with name MultiplicationTable

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Creating input object
        Scanner sc = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
