import java.util.*;

public class VotingEligibilityChecker {

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) - 10; // Random age between -10 and 80
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative age is invalid
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] eligibilityData = checkVotingEligibility(ages);

        // Display the result in tabular format
        displayTable(eligibilityData);

        scanner.close();
    }
}
