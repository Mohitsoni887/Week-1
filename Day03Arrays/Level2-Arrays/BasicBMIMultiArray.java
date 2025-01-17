import java.util.Scanner;

public class BasicBMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // 2D array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3]; // [weight, height, BMI]
        String[] weightStatus = new String[numPersons]; // Array to store weight status

        // Input: Weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble(); // Weight

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble(); // Height
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            double heightInMeters = personData[i][1] / 100; // Convert height to meters
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters); // Calculate BMI

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Output: Display height, weight, BMI, and status
        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight: " + personData[i][0] + " kg");
            System.out.println("  Height: " + personData[i][1] + " cm");
            System.out.println("  BMI: " + personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
