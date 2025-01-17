import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize isPrime as true (assuming the number is prime initially)
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to number-1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // The number is divisible by i, so it's not prime
                    break; // Exit the loop as the number is not prime
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}
