import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {

    public static void main(String[] args) {
        
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        int maxRange = 100;
        int secretNumber = random.nextInt(maxRange) + 1; // Generates a number between 1 and 100
        int maxAttempts = 10;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        
        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I have generated a number between 1 and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it correctly.");
        System.out.println("-------------------------------------------------");

    
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Attempt #" + (attempts + 1) + ": Enter your guess: ");
            
            
            int userGuess = scanner.nextInt();
            
            
            attempts++;
            
            
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                hasGuessedCorrectly = true; // This will stop the loop
            }
        }
        
        
        if (!hasGuessedCorrectly) {
            System.out.println("\n--- Game Over ---");
            System.out.println("Sorry, you've run out of attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }

       
        scanner.close();
    }
}

