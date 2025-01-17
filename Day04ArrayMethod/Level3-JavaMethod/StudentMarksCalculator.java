import java.util.*;

// Creating class for Student Marks Calculator
public class StudentMarksCalculator {
    
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int totalStudents) {
        Random random = new Random();
        int[][] scores = new int[totalStudents][3]; // [students][subjects]

        // Generate random scores (2-digit values) for each student in PCM
        for (int i = 0; i < totalStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics
            scores[i][1] = 10 + random.nextInt(90); // Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Maths
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int totalStudents) {
        double[][] results = new double[totalStudents][3]; // [students][total, average, percentage]

        for (int i = 0; i < totalStudents; i++) {
            int totalMarks = scores[i][0] + scores[i][1] + scores[i][2];
            double average = totalMarks / 3.0;
            double percentage = (totalMarks / 300.0) * 100;

            results[i][0] = totalMarks; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, int totalStudents) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < totalStudents; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t"); // Total as integer
            System.out.print(results[i][1] + "\t"); // Average
            System.out.println(results[i][2] + "%"); // Percentage
        }
    }

    public static void main(String[] args) {
        // Creating object of scanner class for input
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students:");
        int totalStudent = input.nextInt();

        // Generate random scores for each student in PCM (Physics, Chemistry, Maths)
        int[][] scores = generateRandomScores(totalStudent);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores, totalStudent);

        // Display the scorecard in tabular format
        displayScorecard(scores, results, totalStudent);
    }
}
