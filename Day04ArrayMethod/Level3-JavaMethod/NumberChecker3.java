public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;

        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        // Check if the number contains a non-zero digit (other than the first one)
        if (digits[0] == 0) {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        int number = 1204; // Test number

        // Count of digits
        System.out.println("Count of digits in " + number + ": " + countDigits(number));

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits in " + number + ": ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse digits array
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if number is a palindrome
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));

        // Check if number is a duck number
        System.out.println("Is " + number + " a duck number? " + isDuckNumber(number));

        // Another example
        number = 1221; // Palindrome number
        System.out.println("\nIs " + number + " a palindrome? " + isPalindrome(number));
        System.out.println("Is " + number + " a duck number? " + isDuckNumber(number));
    }
}
