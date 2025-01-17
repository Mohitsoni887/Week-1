import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
