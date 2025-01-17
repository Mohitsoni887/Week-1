import java.util.*;

public class CharacterAnalyzer2D {

    // Method to determine the character type
    public static String getCharacterType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            ch = Character.toLowerCase(ch); // Convert to lowercase if uppercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze the string and return a 2D array with character and its type
    public static String[][] analyzeString(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterAnalysis(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("---------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Analyze the string
        String[][] analysisResult = analyzeString(input);

        // Display the result
        displayCharacterAnalysis(analysisResult);

        scanner.close();
    }
}
