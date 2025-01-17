import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status
    public static String[] calculateBMIAndStatus(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        
        // Determine the status based on the BMI
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Return BMI and status as a string array
        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to compute BMI and status for all team members
    public static String[][] computeBMI(double[][] weightHeightData) {
        String[][] result = new String[10][4];
        
        for (int i = 0; i < 10; i++) {
            double weight = weightHeightData[i][0];
            double height = weightHeightData[i][1];
            
            // Get BMI and status for the current person
            String[] bmiStatus = calculateBMIAndStatus(weight, height);
            
            // Store the result in the 2D array
            result[i][0] = String.format("%.2f", height); // Height in cm
            result[i][1] = String.format("%.2f", weight); // Weight in kg
            result[i][2] = bmiStatus[0]; // BMI
            result[i][3] = bmiStatus[1]; // Status
        }
        
        return result;
    }

    // Method to display the BMI details in tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + "\t" +
                               bmiData[i][0] + "\t\t" +
                               bmiData[i][1] + "\t\t" +
                               bmiData[i][2] + "\t" +
                               bmiData[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store weight and height of 10 persons
        double[][] weightHeightData = new double[10][2];
        
        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weightHeightData[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            weightHeightData[i][1] = scanner.nextDouble();
        }
        
        // Compute BMI and Status
        String[][] bmiData = computeBMI(weightHeightData);
        
        // Display the results
        displayResults(bmiData);
    }
}
