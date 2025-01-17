import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of 5 integers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Take user input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("The first number (" + first + ") is ");
        if (first == last) {
            System.out.println("equal to the last number (" + last + ").");
        } else if (first > last) {
            System.out.println("greater than the last number (" + last + ").");
        } else {
            System.out.println("less than the last number (" + last + ").");
        }

        scanner.close(); // Close the scanner
    }
}
