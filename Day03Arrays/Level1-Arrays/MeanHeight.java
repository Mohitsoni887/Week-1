import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0; // Variable to store the sum of all heights

        System.out.println("Enter the heights of 11 football players (in meters):");

        // Input the heights of the players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.printf("The mean height of the football team is: %.2f meters%n", mean);

        scanner.close(); // Close the scanner
    }
}
