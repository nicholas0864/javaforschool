// Nicholas Onigkeit

import java.util.Scanner;

public class RocketsPanthersSpartans {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many games to win");

        int gamesToWin = userInput.nextInt();
        int playerScore = 0;
        int computerScore = 0;
        int computerChoice = -1;
        int playerChoice = -1;
        String playerStrChoice = "";
        String computerStrChoice = "";
        String computerChoices = ""; // Achieving Proficiency: String to hold computer choices for analysis

        while ((playerScore < gamesToWin) && (computerScore < gamesToWin)) {
            computerChoice = (int)(Math.random() * 3) + 1;

            // Determine computer's choice
            if (computerChoice == 1) {
                computerStrChoice = "Rockets";
            } else if (computerChoice == 2) {
                computerStrChoice = "Panthers";
            } else {
                computerStrChoice = "Spartans";
            }

            // Achieving Proficiency: Insert choice into the correct position in the string
            if (computerChoices.indexOf("Rockets") == -1 && computerStrChoice.equals("Rockets")) {
                computerChoices += computerStrChoice + " ";
            } else if (computerChoices.indexOf("Panthers") == -1 && computerStrChoice.equals("Panthers")) {
                computerChoices += computerStrChoice + " ";
            } else if (computerChoices.indexOf("Spartans") == -1 && computerStrChoice.equals("Spartans")) {
                computerChoices += computerStrChoice + " ";
            } else {
                computerChoices += computerStrChoice + " "; // Append choice if it has already been added
            }

            System.out.println("Enter your move, 1 for Rockets, 2 for Panthers, 3 for Spartans");
            playerChoice = userInput.nextInt();

            // Validate user input
            while (playerChoice < 1 || playerChoice > 3) { // Achieving Proficiency: Loop for invalid input
                System.out.println("Invalid choice. Please enter 1, 2, or 3:");
                playerChoice = userInput.nextInt();
            }

            // Determine player's choice
            if (playerChoice == 1) {
                playerStrChoice = "Rockets";
            } else if (playerChoice == 2) {
                playerStrChoice = "Panthers";
            } else {
                playerStrChoice = "Spartans";
            }

            System.out.println("You chose " + playerStrChoice + " I chose " + computerStrChoice);

            // Determine the result of the game
            if (playerChoice == 1) {
                if (computerChoice == 1) {
                    System.out.println("You tied");
                } else if (computerChoice == 2) {
                    System.out.println("You lost");
                    computerScore++;
                } else {
                    System.out.println("You won");
                    playerScore++;
                }
            } else if (playerChoice == 2) {
                if (computerChoice == 2) {
                    System.out.println("You tied");
                } else if (computerChoice == 3) {
                    System.out.println("You lost");
                    computerScore++;
                } else {
                    System.out.println("You won");
                    playerScore++;
                }
            } else {
                if (computerChoice == 3) {
                    System.out.println("You tied");
                } else if (computerChoice == 1) {
                    System.out.println("You lost");
                    computerScore++;
                } else {
                    System.out.println("You won");
                    playerScore++;
                }
            }

            // Print current score
            System.out.println("You have " + playerScore + " wins. I have " + computerScore);
        }

        // Determine overall winner
        if (playerScore < computerScore) {
            System.out.println("I won the whole match! Better luck next time.");
        } else {
            System.out.println("You won the whole match!");
        }

        // Print computer choice analysis
        System.out.println("Computer Choice Analysis: " + computerChoices.trim()); // Achieving Proficiency: Show computer choices
    }
}
