import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Declare variables for the marks of the 3 subjects
        double physics, chemistry, maths;

        // Input marks for each subject
        System.out.print("Enter marks for Physics: ");
        physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        maths = sc.nextDouble();

        // Calculate total and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade and remarks based on the percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        }else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        }else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner
        sc.close();
    }
}
