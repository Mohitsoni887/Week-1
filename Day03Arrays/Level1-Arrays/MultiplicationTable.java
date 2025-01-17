import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[10];

        // Compute the multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // Store result in the array
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        scanner.close(); // Close the scanner
    }
}
