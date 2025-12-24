import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Variable to store reversed string
        String reverse = "";

        // Loop from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {

            // Add each character to reverse string
            reverse = reverse + str.charAt(i);
        }

        // Print reversed string
        System.out.println("Reversed String: " + reverse);
    }
}
