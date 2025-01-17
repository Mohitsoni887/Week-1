import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of a string without using length() method
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the text into words using charAt()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                if (i == length - 1 && text.charAt(i) != ' ') {
                    i++; // Include the last character if it's not a space
                }
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();
        
        // Custom split method
        String[] customSplitWords = customSplit(text);
        
        // Built-in split method
        String[] splitWords = text.split(" ");
        
        // Compare the two results
        boolean areEqual = compareArrays(customSplitWords, splitWords);
        
        // Display the result
        System.out.println("Custom split words: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        System.out.println("Built-in split words: ");
        for (String word : splitWords) {
            System.out.println(word);
        }
        System.out.println("Are the custom split and built-in split results equal? " + areEqual);
    }
}