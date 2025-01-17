import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        // Call the method to generate StringIndexOutOfBoundsException
        generateStringIndexOutOfBoundsException();

        // Call the method to handle StringIndexOutOfBoundsException
        handleStringIndexOutOfBoundsException();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException() {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = input.next();

        // Attempt to access an index beyond the length of the string
        System.out.println("Character at index 100: " + text.charAt(100));  // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleStringIndexOutOfBoundsException() {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = input.next();

        try {
            // Attempt to access an index beyond the length of the string
            System.out.println("Character at index 100: " + text.charAt(100));  // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: The index is out of range.");
        }
    }
}
