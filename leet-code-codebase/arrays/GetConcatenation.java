class Solution {

    // This method returns a new array which is the concatenation of nums with itself
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        // Create a new array 
        int[] ans = new int[2 * n];

        // Copy original array elements to first half
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        // Copy original array elements to second half
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }

        // Return the new array
        return ans;
    }
}
