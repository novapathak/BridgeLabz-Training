import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Starting and ending index
        int start = 0;
        int end = str.length() - 1;

        // Flag variable
        boolean isPalindrome = true;

        // Loop until middle of string
        while (start < end) {

            // Compare characters
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }

            // Move pointers
            start++;
            end--;
        }
        // Print result
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
