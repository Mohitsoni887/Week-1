import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove whitespace and convert to lowercase
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store character frequencies
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        // Count character frequencies for both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i) - 'a']++;
            frequency2[text2.charAt(i) - 'a']++;
        }

        // Compare character frequencies
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }
}
