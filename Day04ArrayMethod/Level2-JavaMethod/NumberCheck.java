import java.util.Scanner;

public class NumberCheck {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero"; // Special case for zero
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  // number1 is greater
        } else if (number1 == number2) {
            return 0;  // both numbers are equal
        } else {
            return -1; // number1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store 5 numbers

        // Get 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String posNeg = isPositive(number);

            if (posNeg.equals("positive")) {
                String evenOdd = isEven(number);
                System.out.println(number + " is positive and " + evenOdd + ".");
            } else if (posNeg.equals("negative")) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last numbers in the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
