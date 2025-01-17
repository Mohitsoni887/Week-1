import java.util.Scanner;
public class LargestAndSecondLargestAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define the initial size of the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                // Copy elements to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // Reassign the digits array to the new array
                digits = temp;
            }
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number /= 10;
        }
        // Initialize variables to store the largest and second-largest digits
        int largest = 0;
        int secondLargest = 0;
        // Find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}