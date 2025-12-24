import java.util.Scanner;

public class MaxOfThree {

    // This method finds maximum of three numbers
   public static int findMax(int a, int b, int c) {
        int max = a;   
        if (b > max)
            max = b;
        // Compare third number
        if (c > max)
            max = c;
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking three numbers from user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calling method to find maximum
        int result = findMax(a, b, c);

        // Display result
        System.out.println("Maximum number is: " + result);
    }
}
