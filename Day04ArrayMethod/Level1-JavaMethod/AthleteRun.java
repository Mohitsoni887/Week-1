import java.util.Scanner;

public class AthleteRun {

    // Method to calculate the number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Perimeter of the triangle
        double distanceToRun = 5000; // Distance in meters (5 km = 5000 meters)
        return distanceToRun / perimeter; // Number of rounds
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the three sides of the triangle
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display the result using System.out.println
        System.out.println("The athlete needs to complete " + rounds + 
                           " rounds to finish a 5 km run.");

        scanner.close(); // Close the scanner
    }
}
