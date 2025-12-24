import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

          // Scanner object to take input from user
		  Scanner sc = new Scanner(System.in);
		  
        String str = sc.nextLine();
		String result = "";

        // Loop through string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If uppercase convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            // If lowercase convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            // Other characters remain same
            else {
                result += ch;
            }
            }
        }

        System.out.println("Toggled String: " + result);
    }
}
