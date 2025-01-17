import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        String[] result = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : result) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    // Method to find character frequencies
    public static String[] findCharacterFrequencies(String text) {
        text = text.replaceAll("\\s", ""); // Remove whitespace
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];

        // Initialize frequencies and count occurrences
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                frequencies[i] = 1; // Initialize frequency to 1
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate as processed
                    }
                }
            }
        }

        // Prepare the result array
        String[] result = new String[characters.length];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequencies[i];
            }
        }

        return result;
    }
}
