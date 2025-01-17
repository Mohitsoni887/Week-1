import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Formula: Combination = (n * (n - 1)) / 2
        if (n < 2) {
            return 0; // No handshakes possible if less than 2 students
        }
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of students: ");
        
        // Read input as integer
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Number of students cannot be negative.");
        } else {
            // Calculate the number of handshakes
            int maxHandshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);
        }

        scanner.close();
    }
}
