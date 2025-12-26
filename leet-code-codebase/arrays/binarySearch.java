class Solution {
  
    public long binarySearch(int n) {

        // Start index
        int start = 0;

        // End index
        int end = n;
        long ans = -1;

        // Binary search loop
        while (start <= end) {
           
            long mid = start + (end - start) / 2;
            long square = mid * mid;
          
            if (square == n) {
                return mid;   
            }
          
            else if (square < n) {
                ans = mid;       
                start = (int) mid + 1; 
            }
            
            else {
                end = (int) mid - 1;   
            }
        }

        // Return 
        return ans;
    }

    // This method calls binarySearch
    public int mySqrt(int x) {
        return (int) binarySearch(x);
    }
}
