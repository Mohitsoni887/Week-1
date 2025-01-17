import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the main string: ");
        String text = input.next();

        System.out.print("Enter the start index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = input.nextInt();

        // Creating a substring using charAt()
        String charAtSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);

        // Creating a substring using the built-in substring() method
        String builtInSubstring = text.substring(startIndex, endIndex);

        // Comparing the two substrings using charAt()
        boolean comparisonResult = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);

        // Displaying the results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Comparison result: " + (comparisonResult ? "Both substrings are the same." : "Substrings are different."));
    }

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();

        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }

        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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
