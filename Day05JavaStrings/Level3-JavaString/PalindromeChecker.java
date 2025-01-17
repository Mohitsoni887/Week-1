import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Perform palindrome checks using three logics
        boolean logic1 = isPalindromeIterative(text);
        boolean logic2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeUsingArrays(text);

        // Display results
        System.out.println("Using Iterative Logic: " + (logic1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Logic: " + (logic2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Array Logic: " + (logic3 ? "Palindrome" : "Not a Palindrome"));
    }

    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        text = text.replaceAll("\\s", "").toLowerCase();
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        text = text.replaceAll("\\s", "").toLowerCase();

        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        text = text.replaceAll("\\s", "").toLowerCase();

        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}
