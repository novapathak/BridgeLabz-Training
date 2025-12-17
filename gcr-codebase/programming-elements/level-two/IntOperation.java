import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variables
        int a, b, c;

        // Take input values
        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.print("Enter value of c: ");
        c = sc.nextInt();

        // Perform integer operations
        int result1 = a + b * c;   // BODMAS rule
        int result2 = a * b + c;   
        int result3 = c + a / b;   
        int result4 = a % b + c;  

        // Displaying results
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
