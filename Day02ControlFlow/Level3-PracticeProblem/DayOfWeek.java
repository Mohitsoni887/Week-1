import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the month (1-12): ");
        int m = scanner.nextInt(); // month

        System.out.print("Enter the day (1-31): ");
        int d = scanner.nextInt(); // day

        System.out.print("Enter the year: ");
        int y = scanner.nextInt(); // year

        // Calculate the day of the week using the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println("Day of the week: " + d0);

        // Close the scanner
        scanner.close();
    }
}