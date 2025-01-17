public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return (square % Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Helper method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        int number = 7; // Test number

        // Check if the number is prime
        System.out.println("Is " + number + " a prime number? " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is " + number + " a neon number? " + isNeonNumber(number));

        // Check if the number is a spy number
        System.out.println("Is " + number + " a spy number? " + isSpyNumber(number));

        // Check if the number is an automorphic number
        System.out.println("Is " + number + " an automorphic number? " + isAutomorphicNumber(number));

        // Check if the number is a buzz number
        System.out.println("Is " + number + " a buzz number? " + isBuzzNumber(number));

        // Another example: number = 376
        number = 376;

        System.out.println("\nIs " + number + " a prime number? " + isPrime(number));
        System.out.println("Is " + number + " a neon number? " + isNeonNumber(number));
        System.out.println("Is " + number + " a spy number? " + isSpyNumber(number));
        System.out.println("Is " + number + " an automorphic number? " + isAutomorphicNumber(number));
        System.out.println("Is " + number + " a buzz number? " + isBuzzNumber(number));
    }
}
