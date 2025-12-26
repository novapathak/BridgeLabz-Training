class Solution {

    // This method returns the complement of a number
    public int findComplement(int n) {

        if (n == 0) {
            return 1;
        }

        int result = 0;  
        int power = 1;   
        // Loop until all bits are processed
        while (n > 0) {

            int bit = n % 2;

            // Flip the bit
            int flippedBit = (bit == 0) ? 1 : 0;
            result = result + (flippedBit * power);
            power = power * 2;
            n = n / 2;
        }

        // Return the complement number
        return result;
    }
}
