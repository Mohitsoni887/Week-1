import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int totalStudents = sc.nextInt();

        // 2D array to store marks for each student in 3 subjects
        double[][] marks = new double[totalStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[totalStudents];
        char[] grades = new char[totalStudents];

        // Input marks for each student
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics, Chemistry, and Maths
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";

                while (true) {
                    System.out.print("Enter marks for " + subject + ": ");
                    double mark = sc.nextDouble();

                    if (mark >= 0) {
                        marks[i][j] = mark; // Store mark in the 2D array
                        break; // Valid mark, exit the loop
                    } else {
                        System.out.println("Invalid input. Marks cannot be negative. Please try again.");
                    }
                }
            }
        }

        // Calculate percentages and grades
        for (int i = 0; i < totalStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; // Total of 3 subjects
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + marks[i][0]);
            System.out.println("  Chemistry: " + marks[i][1]);
            System.out.println("  Maths: " + marks[i][2]);
            System.out.println("  Percentage: " + percentages[i] + "%");
            System.out.println("  Grade: " + grades[i]);
            System.out.println();
        }

        sc.close();
    }
}
