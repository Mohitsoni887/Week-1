import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: sum of n numbers is n + sum of (n-1) numbers
            return n + sumUsingRecursion(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return; // Exit the program if input is not valid
        }

        // Compute the sum using recursion
        int recursionSum = sumUsingRecursion(n);

        // Compute the sum using the formula
        int formulaSum = sumUsingFormula(n);

        // Compare both results and display the result
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursionSum);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);

        if (recursionSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results do not match.");
        }

        scanner.close();
    }
}
