import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // Exit the program
        }

        // Create arrays to store odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int evenIndex = 0, oddIndex = 0;

        // Iterate from 1 to the user-entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even numbers array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd numbers array
            }
        }

        // Print the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        scanner.close(); 
    }
}
