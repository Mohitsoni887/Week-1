/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order
*/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int count = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        tempNumber = number;
        
        // Store digits in the array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Create an array to store the digits in reverse order
        int[] reverseDigits = new int[count];
        
        // Copy digits into the reverse array
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        scanner.close();
    }
}
