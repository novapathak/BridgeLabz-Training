import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loop for multiple voters
        while (true) {

            System.out.println("\nEnter age (Enter -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("Voting ended.");
                break;
            }

            // Check voting eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Press 1 for Candidate A");
                System.out.println("Press 2 for Candidate B");
                System.out.println("Press 3 for Candidate C");

                int vote = sc.nextInt();

                // Record vote
                if (vote == 1)
                    System.out.println("Vote recorded for Candidate A");
                else if (vote == 2)
                    System.out.println("Vote recorded for Candidate B");
                else if (vote == 3)
                    System.out.println("Vote recorded for Candidate C");
                else
                    System.out.println("Invalid vote");
            }
            else {
                System.out.println("You are not eligible to vote.");
            }
        }
        sc.close();
    }
}
