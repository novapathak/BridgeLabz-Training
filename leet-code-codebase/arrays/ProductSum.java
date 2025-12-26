class Solution {
    public int subtractProductAndSum(int n) {

        // Variable to store sum 
        int sum = 0;

        // Variable to store product 
        int product = 1;

        // Loop 
        while (n != 0) {

            // Get the last digit of the number
            int rem = n % 10;

            // Add digit to sum
            sum = sum + rem;

            // Multiply digit with product
            product = product * rem;

            // Remove the last digit from the number
            n = n / 10;
        }

        // Calculate answer
        int answer = product - sum;

        // Return  result
        return answer;
    }
}
