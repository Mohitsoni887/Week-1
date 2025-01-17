/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
*/
import java.util.*;
//Creating class for Student Marks Calulate
public class StudentMarksCalculator {
    public static void main(String[] args) {
		//Creating object of scanner class for input
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students:");
        int totalStudent = input.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[totalStudent];
        int[] chemistryMarks = new int[totalStudent];
        int[] mathsMarks = new int[totalStudent];
        double[] percentages = new double[totalStudent];
        char[] grades = new char[totalStudent];

        // Input marks for each student
        for (int i = 0; i < totalStudent; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physicsMarks[i] = input.nextInt();
            if (physicsMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = input.nextInt();
            if (chemistryMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            mathsMarks[i] = input.nextInt();
            if (mathsMarks[i] < 0) {
                System.out.println("Please enter a positive value.");
                i--;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < totalStudent; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display the results
		System.out.println("\nResults:");
		for (int i = 0; i < totalStudent; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Maths: " + mathsMarks[i]);
            System.out.println("  Percentage: " + percentages[i] + "%");
            System.out.println("  Grade: " + grades[i]);
            System.out.println();
        }      
    }
}