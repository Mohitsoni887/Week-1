import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given month and day are within the spring season (March 20 to June 20)
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true; // March 20 or later
        } else if (month > 3 && month < 6) {
            return true; // April and May
        } else if (month == 6 && day <= 20) {
            return true; // June 20 or earlier
        }
        return false; // Otherwise not in spring season
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Check if the date is in the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the scanner
        scanner.close();
    }
}
