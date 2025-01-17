import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the first non-repeating character
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(text);

        if (firstNonRepeatingChar != 0) {
            System.out.println("First Non-Repeating Character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Method to find the first non-repeating character using charAt()
    public static char findFirstNonRepeatingCharacter(String text) {
        text = text.replaceAll("\\s", ""); // Remove whitespace
        int[] frequency = new int[256]; // Array to store frequencies of all ASCII characters

        // Count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return 0; // Return 0 if no non-repeating character is found
    }
}
