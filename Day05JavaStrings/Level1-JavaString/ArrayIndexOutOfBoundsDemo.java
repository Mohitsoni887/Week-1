import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        // Call the method to generate ArrayIndexOutOfBoundsException
        generateArrayIndexOutOfBoundsException();

        // Call the method to handle ArrayIndexOutOfBoundsException
        handleArrayIndexOutOfBoundsException();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() {
        Scanner input = new Scanner(System.in);

        // Define an array of names
        String[] names = new String[3];

        // Take user input for names
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        // This will generate ArrayIndexOutOfBoundsException as the index 5 is beyond the array length
        System.out.println("Accessing name at index 5: " + names[5]);  // Invalid index
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexOutOfBoundsException() {
        Scanner input = new Scanner(System.in);

        // Define an array of names
        String[] names = new String[3];

        // Take user input for names
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        try {
            // This will throw ArrayIndexOutOfBoundsException if we try to access an invalid index
            System.out.println("Accessing name at index 5: " + names[5]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Index is out of bounds!");
        } catch (RuntimeException e) {
            // Handle other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}
