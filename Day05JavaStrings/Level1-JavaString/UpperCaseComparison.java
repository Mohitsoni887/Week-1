import java.util.Scanner;

public class UpperCaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Convert text to uppercase using user-defined method
        String customUpperCaseText = convertToUpperCaseUsingCharAt(text);

        // Convert text to uppercase using the built-in method
        String builtInUpperCaseText = text.toUpperCase();

        // Compare the two results
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        // Display the results
        System.out.println("Custom Uppercase Text: " + customUpperCaseText);
        System.out.println("Built-in Uppercase Text: " + builtInUpperCaseText);
        System.out.println("Are both results equal? " + areEqual);
    }

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Convert to uppercase if it's a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar = (char) (currentChar - 32);
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
