//Creating Class with name PowerFor
import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        // Loop power times
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println("Result is: " + result);
    }
}
