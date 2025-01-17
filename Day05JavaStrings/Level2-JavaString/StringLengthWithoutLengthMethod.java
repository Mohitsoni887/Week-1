import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    
    // Method to find length of a string without using length() method
    public static int getLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            // Infinite loop until charAt throws an exception
            while (true) {
                str.charAt(count); // Try accessing character at the given index
                count++; // Increase count for each valid character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is thrown when the index exceeds the string length
            return count; // Return the count when exception occurs
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        
        // Close the scanner to avoid resource leak
        scanner.close();
        
        // Call the user-defined method and built-in method to find the length
        int customLength = getLengthWithoutLengthMethod(inputString);
        int builtInLength = inputString.length();
        
        // Display both lengths
        System.out.println("Custom method length: " + customLength);
        System.out.println("Built-in length() method: " + builtInLength);
    }
}
