import java.util.Scanner;

public class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Year should be greater than or equal to 1582 (Gregorian calendar)
        if (year < 1582) {
            return false; // Gregorian calendar starts from 1582
        }
        
        // A year is a leap year if it is divisible by 4, but not divisible by 100,
        // unless it is also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        } else {
            return false; // It's not a leap year
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take year input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
