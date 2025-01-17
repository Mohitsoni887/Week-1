/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/
import java.util.*; 
public class DigitFrequencyOfEveryElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number:");
        int number = scanner.nextInt(); 

        // Handling negative
        if (number < 0) {
            number = Math.abs(number);
        }

        // Counting the number of digits
        int temp = number;
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];
        int index = 0;

        // Storing digits in the array
        if (number == 0) {
            digits[index++] = 0;
        } else {
            while (number != 0) {
                digits[index++] = number % 10;
                number /= 10;
            }
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Calculating frequency
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        scanner.close();
		 
    }
}

