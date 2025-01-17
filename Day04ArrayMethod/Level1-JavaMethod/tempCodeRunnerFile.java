import java.util.Scanner;

public class QuotientAndRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient using division operator (/)
        int quotient = number / divisor;
        
        // Calculate remainder using modulus operator (%)
        int remainder = number % divisor;
        
        // Return the quotient and remainder in an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output the quotient and remainder
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);

        // Close the scanner
        scanner.close();
    }
}
