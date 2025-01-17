import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        // Call the method to generate NumberFormatException
        generateNumberFormatException();

        // Call the method to handle NumberFormatException
        handleNumberFormatException();
    }

    // Method to generate NumberFormatException
    public static void generateNumberFormatException() {
        Scanner input = new Scanner(System.in);

        // Take user input as a string
        System.out.print("Enter a number: ");
        String text = input.next();

        // This will throw NumberFormatException if the text cannot be converted to an integer
        int number = Integer.parseInt(text);  // Invalid input (e.g., "abc") will cause an exception
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException() {
        Scanner input = new Scanner(System.in);

        // Take user input as a string
        System.out.print("Enter a number: ");
        String text = input.next();

        try {
            // This will throw NumberFormatException if the text cannot be converted to an integer
            int number = Integer.parseInt(text);  // Invalid input (e.g., "abc") will cause an exception
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("Caught a NumberFormatException: Invalid input. Please enter a valid number.");
        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}
