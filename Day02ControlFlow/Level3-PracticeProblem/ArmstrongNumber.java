import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // While loop to check for Armstrong number
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Calculate the cube of the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        sc.close();
    }
}
