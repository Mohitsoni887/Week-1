import java.util.Scanner;

public class CharacterFrequencyUsingCharAt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find characters and their frequencies
        String[][] result = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String[] entry : result) {
            if (entry != null) {
                System.out.println(entry[0] + " - " + entry[1]);
            }
        }
    }

    // Method to find character frequencies using charAt()
    public static String[][] findCharacterFrequencies(String text) {
        text = text.replaceAll("\\s", ""); // Remove whitespace
        int[] frequency = new int[256]; // Array to store frequencies of all ASCII characters

        // Count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Prepare the result array
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }
}
