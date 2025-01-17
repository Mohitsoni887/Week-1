import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize the count variable to 0
        int count = 0;

        // Use a loop to count the digits
        while (number != 0) {
            // Remove the last digit by dividing the number by 10
            number /= 10;

            // Increment the count in each iteration
            count++;
        }

        // Display the number of digits
        System.out.println("The number has " + count + " digits.");

        // Close the scanner
        sc.close();
    }
}
