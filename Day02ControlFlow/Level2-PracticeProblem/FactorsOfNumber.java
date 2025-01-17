import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");

        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print i if it's a factor
            }
        }

        // Close the scanner
        sc.close();
    }
}
