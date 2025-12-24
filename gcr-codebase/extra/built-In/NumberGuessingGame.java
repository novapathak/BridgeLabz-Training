import java.util.Scanner;
public class NumberGuessingGame {
    public static int generateGuess(int min, int max) {
        // Taking middle value as guess
        return (min + max) / 2;
    }

    public static String getFeedback(Scanner sc) {
        // User tells if guess is high, low or correct
        return sc.next();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1;         
        int max = 100;        
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100");

       
        while (!correct) {

            int guess = generateGuess(min, max);   
            System.out.println("Computer guessed: " + guess);

            System.out.print("Enter feedback (high / low / correct): ");
            String feedback = getFeedback(sc);
            if (feedback.equals("high")) {
                max = guess - 1;
            }
            else if (feedback.equals("low")) {
                min = guess + 1;
            }
            else if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number!");
                correct = true;
            }
        }
    }
}
