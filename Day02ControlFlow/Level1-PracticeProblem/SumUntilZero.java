import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        // Loop to continue until user enters 0
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = sc.nextDouble();

            // Check if the user entered 0
            if (userInput == 0) {
                break; // Exit the loop
            }

            // Add the user input to the total
            total += userInput;
        }

        // Display the total
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
