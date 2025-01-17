import java.util.*;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String input) {
        int start = 0, end = input.length() - 1;

        // Trim leading spaces
        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String input, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(input.charAt(i));
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

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trim spaces using custom method
        int[] indices = trimSpaces(input);
        String trimmedCustom = createSubstring(input, indices[0], indices[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Custom Trimmed String: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed String: '" + trimmedBuiltIn + "'");
        System.out.println("Are both results the same? " + isSame);

        scanner.close();
    }
}
