import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum variable to 0
        int sum = 0;

        // Run a loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner
        sc.close();
    }
}
