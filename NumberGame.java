import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
            int attemptsLeft = 5; // Limiting the number of attempts to 5
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("I have generated a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it.");

            while (attemptsLeft > 0 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    hasGuessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attemptsLeft--;
                if (attemptsLeft > 0 && !hasGuessedCorrectly) {
                    System.out.println("You have " + attemptsLeft + " attempts left.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you're out of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score is: " + score);
        System.out.println("Thanks for playing the Number Game!");
        scanner.close();
    }
}
|