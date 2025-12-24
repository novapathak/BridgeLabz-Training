import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();

        // Result string without duplicates
        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            // If character not already in result
            if (result.indexOf(str.charAt(i)) == -1) {
                result = result + str.charAt(i);
            }
        }
        // Print final string
        System.out.println("Modified String: " + result);
    }
}
