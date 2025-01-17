import java.util.Scanner;

public class WordLengthWithCustomMethods {

    // Method to count the length of a string without using length() method
    public static int getLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            // Keep counting characters until we reach the end of the string
            while (true) {
                str.charAt(count); // Accessing each character one by one
                count++; // Increase the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the end of the string is reached, return the count
            return count;
        }
    }

    // Method to split the text into words (without using split() method)
    public static String[] customSplit(String text) {
        int length = getLengthWithoutLengthMethod(text); // Get the length of the sentence
        int wordCount = 0;

        // Count the number of words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++; // Increase word count when a space is found
            }
        }
        wordCount++; // Add 1 because the last word does not have a space after it
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using space as a separator
        for (int i = 0; i < length; i++) {
            if (i == length - 1 || text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(startIndex, i == length - 1 ? i + 1 : i);
                wordIndex++;
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Method to return words with their lengths in a 2D array
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2]; // 2D array for words and lengths
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(getLengthWithoutLengthMethod(words[i])); // Store the length as a string
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input sentence from the user
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        // Close the scanner to avoid resource leak
        scanner.close();
        
        // Split the text into words using the custom method
        String[] words = customSplit(inputText);
        
        // Get words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        // Display the words and their lengths using println
        System.out.println("Word and its Length:");
        for (String[] wordLength : wordsWithLengths) {
            // Convert the length from String to Integer for display
            int length = Integer.parseInt(wordLength[1]);
            System.out.println("Word: " + wordLength[0] + ", Length: " + length); // Display word and length
        }
    }
}
