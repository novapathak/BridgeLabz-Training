public class PalindromeCheck {
	//method to check if string is palindrome
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    public static boolean isPalindromeRec(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRec(s, start + 1, end - 1);
    }
	//method to check palindrome array
    public static boolean isPalindromeArray(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String text = "madam";
		
		//Display output
        System.out.println(isPalindrome(text));
        System.out.println(isPalindromeRec(text, 0, text.length() - 1));
        System.out.println(isPalindromeArray(text));
    }
}
