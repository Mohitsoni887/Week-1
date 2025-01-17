import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Ensure the year is greater than or equal to 1582 (Gregorian Calendar)
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Single if statement with logical AND (&&) and OR (||) operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}
