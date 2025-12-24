import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

         // Scanner object to take input from user
		 Scanner sc = new Scanner(System.in);
		 
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Assume first word is longest
        String longest = words[0];

        // Compare length of each word
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        // Print longest word
        System.out.println("Longest Word: " + longest);
    }
}
