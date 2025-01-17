import java.util.Scanner;

public class BMI {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; // weight in kg
            double heightCm = personData[i][1]; // height in cm
            double heightM = heightCm / 100; // convert height to meters
            double bmi = weight / (heightM * heightM); // calculate BMI
            personData[i][2] = bmi; // store BMI in third column
        }
    }

    // Method to determine the BMI status
    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2]; // get BMI from the array
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store the weight, height, and BMI for 10 people
        double[][] personData = new double[10][3];
        
        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            
            // Input weight in kg
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            
            // Input height in cm
            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate the BMI for each person
        calculateBMI(personData);

        // Get the BMI status for each person
        String[] bmiStatus = getBMIStatus(personData);

        // Display the results
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm, BMI: " + personData[i][2] + ", Status: " + bmiStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
