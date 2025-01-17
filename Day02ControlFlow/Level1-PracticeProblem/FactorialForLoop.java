import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else if (number == 0) {
            // Factorial of 0 is 1
            System.out.println("The factorial of 0 is 1.");
        } else {
            // Calculate factorial using a for loop
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i in each iteration
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }

        sc.close();
    }
}
