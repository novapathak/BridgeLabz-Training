import java.util.Scanner;
public class VAndCChecker {

    // Method to check character type
    public static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants
    public static String[][] findCharacters(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display 2D array
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete string input
        System.out.print("Enter the text: ");
        String input = sc.nextLine();

        // Call method to find characters
        String[][] result = findCharacters(input);

        // Display the result
        displayResult(result);

        sc.close();
    }
}
