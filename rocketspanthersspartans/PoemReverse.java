import java.util.Scanner;

public class PoemReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to the Poem Reverse program!");
        System.out.print("Please enter a line from a poem or song: ");
        String inputLine = scanner.nextLine();
        
        // Part 1: Print each word on a new line
        System.out.println("\nWords from your input:");
        
        int currentIndex = 0; // Start at the beginning of the input
        int spaceIndex; // To find spaces in the input
        
        // Loop to find each word
        while ((spaceIndex = inputLine.indexOf(" ", currentIndex)) != -1) {
            String word = inputLine.substring(currentIndex, spaceIndex);
            System.out.println(word); // Print the word
            currentIndex = spaceIndex + 1; // Move to the next word
        }
        
        // Print the last word (after the last space)
        String lastWord = inputLine.substring(currentIndex);
        System.out.println(lastWord);
        
        // Part 2: Print the words in reverse order
        System.out.println("\nReversed order of the words:");
        
        String reversedWords = ""; // Start with an empty string
        currentIndex = 0; // Reset index for reversing
        
        // Loop to reverse the order of the words
        while ((spaceIndex = inputLine.indexOf(" ", currentIndex)) != -1) {
            String word = inputLine.substring(currentIndex, spaceIndex);
            reversedWords = word + " " + reversedWords; // Add the word to the front
            currentIndex = spaceIndex + 1; // Move to the next word
        }
        
        // Add the last word to the reversed string
        lastWord = inputLine.substring(currentIndex);
        reversedWords = lastWord + " " + reversedWords;
        
        // Print the reversed string, trimming extra spaces
        System.out.println(reversedWords.trim());
        
        // Farewell message
        System.out.println("\nThanks for using the Poem Reverse program! Goodbye!");
        
        scanner.close(); // Close the scanner
    }
}
