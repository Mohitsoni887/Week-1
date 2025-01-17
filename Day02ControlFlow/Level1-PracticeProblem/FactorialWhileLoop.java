import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else if (number == 0) {
            // Factorial of 0 is 1
            System.out.println("The factorial of 0 is 1.");
        } else {
            // Calculate factorial using a while loop
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i; // Multiply the current value of factorial by i
                i++; // Increment i
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }

        sc.close();
    }
}
