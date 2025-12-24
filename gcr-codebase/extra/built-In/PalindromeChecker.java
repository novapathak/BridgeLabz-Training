import java.util.Scanner;

public class PalindromeChecker {

    // This method checks if string is palindrome
    static boolean isPalindrome(String str) {

        int start = 0;                 
        int end = str.length() - 1;     

        // Compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;  
	}

    public static void main(String[] args) {
		//Scanner object to take input
        Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();
        // Display result
        if (isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
