import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read full string and convert to lowercase
        String str = sc.nextLine().toLowerCase();

        // Variables to store count
        int vowels = 0;
        int consonants = 0;

        // Loop through each character of string
        for (int i = 0; i < str.length(); i++) {

            // Get single character
            char ch = str.charAt(i);

            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check if vowel
                if (ch =='a' || ch =='e' || ch =='i' ||
                    ch =='o' || ch =='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Print result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
