import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Input validation
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0; // Current index in the factors array

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                if (index == maxFactor) {
                    // Resize the array if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Add the factor and increment the index
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close(); 
    }
}
