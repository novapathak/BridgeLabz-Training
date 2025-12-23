public class FactorsProgram {

// Method to find factors and return array
    static int[] findFactors(int num) {
        int count = 0;
        // First loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }
    // Method to find greatest factor
    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    // Method to find sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }
    // Method to find product of factors
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }
    // Method to find product of cube of factors
    static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }
    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));
    }
}
