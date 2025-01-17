/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
*/

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Arrays to store data
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Input: Get weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
        }

        // Calculate BMI and weight status
        for (int i = 0; i < numPersons; i++) {
            double heightInMeters = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Output: Display results for each person
        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight: " + weight[i] + " kg");
            System.out.println("  Height: " + height[i] + " cm");
            System.out.println("  BMI: " + bmi[i]);
            System.out.println("  Status: " + status[i]);
        }

        sc.close();
    }
}
