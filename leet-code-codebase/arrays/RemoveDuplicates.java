class Solution {
    public int removeDuplicates(int[] nums) {

        // If array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

 
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {

                // Place the unique element at position k
                nums[k] = nums[i];

                // Move k to next position
                k++;
            }
        }
        return k;
    }
}
