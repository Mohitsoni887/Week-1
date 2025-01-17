import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Run a for loop backward from 100 to 1
        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner
        sc.close();
    }
}
