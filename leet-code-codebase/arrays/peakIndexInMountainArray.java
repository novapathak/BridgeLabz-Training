class Solution {

    // This method returns the index of the peak element
    public int peakIndexInMountainArray(int[] arr) {

        // low is the starting index
        int low = 0;

        // high is the last index
        int high = arr.length - 1;

        // Binary search loop
        while (low < high) {

            // Find the middle index
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {

                low = mid + 1;
			}
           else {
                high = mid;
            }
        }

       
        return low;
    }
}
