import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate the age to be non-negative
        if (age < 0) {
            return false;  // Cannot vote for invalid age
        }
        // Check if the age is 18 or greater
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();  // Create an instance of the class

        // Loop to take input for ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote
            boolean canVote = checker.canStudentVote(studentAges[i]);
            
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
