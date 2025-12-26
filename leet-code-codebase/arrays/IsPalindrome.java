class Solution {

    // This method checks if a number is palindrome
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;  
        int reverse = 0;  

        // Reverse the number
        while (x != 0) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x / 10;
        }

        // Check if original and reversed numbers are same
        return original == reverse;
    }
}
