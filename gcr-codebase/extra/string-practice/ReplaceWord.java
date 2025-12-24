import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {

        // Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        String result = "";
        // Split sentence into words
        String[] words = sentence.split(" ");

        // Replace word manually
        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }
        System.out.println("Modified Sentence: " + result.trim());
    }
}
