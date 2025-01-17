import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the base number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize result to 1
        int result = 1;

        // Run the loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with number in each iteration
        }

        // Output the result
        System.out.println(number + " raised to the power of " + power + " is " + result);

        // Close the scanner
        sc.close();
    }
}
