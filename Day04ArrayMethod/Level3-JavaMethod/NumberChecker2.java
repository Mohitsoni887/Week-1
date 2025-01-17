import java.util.Arrays;

public class NumberChecker2 {

    public static void main(String[] args) {
        int number = 21;

        // Find count of digits
        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);

        // Store digits in an array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Find the sum of digits
        int sumOfDigits = sumDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of the squares of digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] freq : digitFrequency) {
            if (freq[1] > 0) { // Display only digits with non-zero frequency
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            }
        }
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column is the digit
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Second column is the frequency
        }
        return frequency;
    }
}
