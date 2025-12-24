import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {

        // Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();   // Main string
        String sub = sc.nextLine();   // Substring

        int count = 0;
        // Loop through main string
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            // Check substring character by character
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j))
                    break;
            }
            // If full substring matched
            if (j == sub.length())
                count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
