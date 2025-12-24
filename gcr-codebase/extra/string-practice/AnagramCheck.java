import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        // Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // If lengths differ, not anagram
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        boolean isAnagram = true;
        // Check frequency of each character
        for (int i = 0; i < s1.length(); i++) {
            int count1 = 0, count2 = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) count1++;
                if (s1.charAt(i) == s2.charAt(j)) count2++;
            }
            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }
}
