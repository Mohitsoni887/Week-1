import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to hold up to 10 elements
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0; // Index to keep track of array position

        System.out.println("Enter numbers (0 or a negative number to stop):");

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();

            // Break the loop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if the array has reached its maximum capacity
            if (index == 10) {
                System.out.println("Array capacity reached (10 numbers).");
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the sum and display the numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add the value to the total
        }

        // Display the total
        System.out.println("\nTotal of all numbers: " + total);

        scanner.close(); 
    }
}
