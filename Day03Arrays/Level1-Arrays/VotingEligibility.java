import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array of size 10 to store the ages
        int[] ages = new int[10];
        
        System.out.println("Enter the ages of 10 students:");

        // Take user input for ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1) + ".");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        
        scanner.close(); 
    }
}
