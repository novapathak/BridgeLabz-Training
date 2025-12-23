import java.util.Scanner;

public class LowerCase {

    // Method to convert text to lowercase using charAt
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }

        return result;
    }
    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
       
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are equal
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input including spaces
        System.out.print("Enter the complete text: ");
        String inputText = sc.nextLine();

        // Convert using built-in method
        String builtInLower = inputText.toLowerCase();

        // Convert using user-defined method
        String customLower = convertToLowerCase(inputText);

        // Compare both strings
        boolean isSame = compareStrings(builtInLower, customLower);

        // Display results
        System.out.println("\nBuilt-in toLowerCase(): " + builtInLower);
        System.out.println("User-defined Lowercase: " + customLower);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
