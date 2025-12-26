class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        // Loop through each customer
        for (int[] customer : accounts) {

            // Calculate total wealth of current customer
            int wealth = 0;
            for (int account : customer) 
                wealth += account;

            // Update maximum wealth 
            maxWealth = Math.max(maxWealth, wealth);
        }
        // Return the richest customer's wealth
        return maxWealth;
    }
}
