import java.util.Scanner;

public class StringCharacterComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter the string: ");
        String text = input.next();

        // Get characters using the user-defined method
        char[] userDefinedCharArray = getCharactersUsingLoop(text);

        // Get characters using the built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();

        // Compare the two char arrays
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);

        // Display the result
        if (areArraysEqual) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }
    }

    // Method to return characters using a loop (user-defined)
    public static char[] getCharactersUsingLoop(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        // Check if lengths are the same
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
