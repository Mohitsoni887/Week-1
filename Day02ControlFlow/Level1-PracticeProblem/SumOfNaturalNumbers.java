import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Display both results
            System.out.println("Sum calculated using formula: " + formulaSum);
            System.out.println("Sum calculated using while loop: " + loopSum);

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
