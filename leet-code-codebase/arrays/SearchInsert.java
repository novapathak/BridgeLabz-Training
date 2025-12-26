class Solution {
    public int searchInsert(int[] nums, int target) {

        // Get the size of the array
        int n = nums.length;
        int low = 0;
        int high = n - 1; 
        int ans = 0;

        // Loop until the search space is valid
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                ans = mid + 1;  
                low = mid + 1;   
            }
            else if (nums[mid] == target) {
                return mid;
            }

            // If middle element is greater than target
            else {
                high = mid - 1; 
            }
        }

        // Return 
        return ans;
    }
}
