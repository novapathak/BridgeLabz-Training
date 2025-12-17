import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variable for number of students
        int numberOfStudents;

        // Take input from user
        System.out.print("Enter number of students: ");
        numberOfStudents = sc.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
    }
}
