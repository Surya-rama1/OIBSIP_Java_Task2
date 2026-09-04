import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*Number Guessing game*/

public class NumberGuessingGame {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final List<String> roundSummaries = new ArrayList<>();
        public static void main(String[] args) {
        System.out.println("=== Welcome to the Number Guessing Game ===");

        int roundNumber = 1;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("\n----- Round " + roundNumber + " -----");
            playRound(roundNumber);
            playAgain = askYesNo("Play again? (yes/no): ");
            roundNumber++;
        }

        printFinalScoreboard();
        System.out.println("\nThanks for playing!");
        scanner.close();
    }
    private static void playRound(int roundNumber) {
        Difficulty difficulty = chooseDifficulty();

        int secretNumber = random.nextInt(difficulty.maxRange) + 1;
        int attemptsUsed = 0;
        boolean won = false;

        System.out.println("I'm thinking of a number between 1 and "
                + difficulty.maxRange + ". You have " + difficulty.maxAttempts + " attempts.");

        while (attemptsUsed < difficulty.maxAttempts) {
            int guess = readGuess(difficulty.maxRange);
            attemptsUsed++;

            if (guess == secretNumber) {
                System.out.println("Correct! You got it in " + attemptsUsed + " attempt(s).");
                won = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            int attemptsLeft = difficulty.maxAttempts - attemptsUsed;
            System.out.println("Attempts used: " + attemptsUsed + "/" + difficulty.maxAttempts
                    + " | Attempts left: " + attemptsLeft);
        }

        if (!won) {
            System.out.println("You Lost! The number was: " + secretNumber);
        }

        // Record the outcome for the end-of-session scoreboard.
        String outcome = won
                ? "Round " + roundNumber + " (" + difficulty.name + ") \u2014 guessed in " + attemptsUsed + " attempts"
                : "Round " + roundNumber + " (" + difficulty.name + ") \u2014 lost (number was " + secretNumber + ")";
        roundSummaries.add(outcome);
    }
    private static int readGuess(int maxRange) {
        while (true) {
            System.out.print("Enter your guess (1-" + maxRange + "): ");
            String input = scanner.nextLine().trim();

            try {
                int guess = Integer.parseInt(input);
                if (guess < 1 || guess > maxRange) {
                    System.out.println("Please enter a number between 1 and " + maxRange + ".");
                    continue;
                }
                return guess;
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }
    }
    private static Difficulty chooseDifficulty() {
        System.out.println("Choose a difficulty:");
        System.out.println("  1) Easy   (1-50,  10 attempts)");
        System.out.println("  2) Medium (1-100, 7 attempts)");
        System.out.println("  3) Hard   (1-200, 5 attempts)");

        while (true) {
            System.out.print("Enter choice (1-3): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    return new Difficulty("Easy", 50, 10);
                case "2":
                    return new Difficulty("Medium", 100, 7);
                case "3":
                    return new Difficulty("Hard", 200, 5);
                default:
                    System.out.println("Invalid choice, please enter 1, 2, or 3.");
            }
        }
    }

    /*Simple yes/no*/
    private static boolean askYesNo(String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {
                return true;
            } else if (answer.equals("n") || answer.equals("no")) {
                return false;
            } else {
                System.out.println("Please answer yes or no.");
            }
        }
    }
    private static void printFinalScoreboard() {
        System.out.println("\n=== Final Scoreboard ===");
        for (String summary : roundSummaries) {
            System.out.println(summary);
        }
    }
    private static class Difficulty {
        final String name;
        final int maxRange;
        final int maxAttempts;

        Difficulty(String name, int maxRange, int maxAttempts) {
            this.name = name;
            this.maxRange = maxRange;
            this.maxAttempts = maxAttempts;
        }
    }
}