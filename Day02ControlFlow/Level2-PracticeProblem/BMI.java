import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for weight and height
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble(); // weight in kg

        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble(); // height in cm

        // Convert height from centimeters to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine and display the weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the scanner
        sc.close();
    }
}
