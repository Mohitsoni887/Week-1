import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display both results
            System.out.println("Sum calculated using formula: " + formulaSum);
            System.out.println("Sum calculated using for loop: " + loopSum);

            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("Both calculations match and are correct!");
            } else {
                System.out.println("There is a mismatch between the calculations.");
            }
        }

        sc.close();
    }
}
