import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rad = new Random();
        
        int numberToGuess = rad.nextInt(100) + 1; 
        int guess;          
        int attempts = 0;    
        int maxAttempts = 5; 

        System.out.println("Welcome to Number Guessing Game! ");
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++; 

            if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations,You guessed it in " + attempts + " tries.");
                break; 
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry! You've reached maximum attempts. The number was " + numberToGuess);
                break;
            }

        } while (true); 
        sc.close(); 
    }
}
