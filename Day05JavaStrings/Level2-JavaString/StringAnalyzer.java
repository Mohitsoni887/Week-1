import java.util.*;

public class StringAnalyzer {

    // Method to find the length of a string
    public static int getStringLength(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split the text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            } else {
                currentWord.append(ch);
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        return words.toArray(new String[0]);
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
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

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Split text using custom method
        String[] customSplitWords = splitTextIntoWords(input);

        // Split text using built-in split() method
        String[] builtInSplitWords = input.split(" ");

        // Compare the two methods
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display results
        System.out.println("Words using custom method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the two methods producing the same result? " + areEqual);

        scanner.close();
    }
}
