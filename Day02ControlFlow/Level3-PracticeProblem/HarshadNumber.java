import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store the original number for later use
        int originalNumber = number;

        // Initialize sum variable to 0
        int sum = 0;

        // While loop to sum the digits of the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner
        sc.close();
    }
}
