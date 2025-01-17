import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;

        // Loop from number - 1 down to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; // Assign the greatest factor
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " is " + greatestFactor);

        // Close the scanner
        sc.close();
    }
}
4