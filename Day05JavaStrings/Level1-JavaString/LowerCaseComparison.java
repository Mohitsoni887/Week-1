import java.util.Scanner;

public class LowerCaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Convert text to Lowercase using user-defined method
        String customLowerCaseText = convertToLowerCaseUsingCharAt(text);

        // Convert text to Lowercase using the built-in method
        String builtInLowerCaseText = text.toLowerCase();

        // Compare the two results
        boolean areEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);

        // Display the results
        System.out.println("Custom Lowercase Text: " + customLowerCaseText);
        System.out.println("Built-in Lowercase Text: " + builtInLowerCaseText);
        System.out.println("Are both results equal? " + areEqual);
    }

    // Method to convert text to uppercase using charAt()
    public static String convertToLowerCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Convert to Lowercase if it's a Uppercase letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + 32);
            }

            // Append the character to the result
            result.append(currentChar);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
