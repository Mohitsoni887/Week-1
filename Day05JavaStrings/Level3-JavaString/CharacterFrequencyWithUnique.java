import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters and their frequencies
        String[][] result = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String[] entry : result) {
            if (entry != null) {
                System.out.println(entry[0] + " - " + entry[1]);
            }
        }
    }

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        text = text.replaceAll("\\s", ""); // Remove whitespace
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(current)) == -1) {
                uniqueChars.append(current);
            }
        }

        return uniqueChars.toString().toCharArray();
    }

    // Method to find character frequencies
    public static String[][] findCharacterFrequencies(String text) {
        text = text.replaceAll("\\s", ""); // Remove whitespace
        int[] frequency = new int[256]; // Array to store frequencies of all ASCII characters

        // Count character frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Prepare the result array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }
}
