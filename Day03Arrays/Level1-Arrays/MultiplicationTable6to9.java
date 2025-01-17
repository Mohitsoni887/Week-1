import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an integer array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Using a for loop to find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Save result in the array
        }

        // Display the results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
