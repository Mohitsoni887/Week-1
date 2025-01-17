import java.util.*;

public class StringAnalyzer2D {

    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        String word = "";
        List<String> words = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.isEmpty()) {
            words.add(word);
        }

        return words.toArray(new String[0]);
    }

    // Method to find the length of a string
    public static int getStringLength(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (getStringLength(word) < getStringLength(shortest)) {
                shortest = word;
            }
            if (getStringLength(word) > getStringLength(longest)) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Split text into words
        String[] words = splitTextIntoWords(input);

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(words);

        // Display results
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
