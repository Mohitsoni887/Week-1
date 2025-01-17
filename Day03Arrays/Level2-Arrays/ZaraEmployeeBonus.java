import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays for salary and years of service for 10 employees
        double[] oldSalary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Variables to store total values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input employee details
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Input salary with validation
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                oldSalary[i] = scanner.nextDouble();
                if (oldSalary[i] > 0) {
                    break; // If salary is valid, exit the loop
                } else {
                    System.out.println("Invalid salary! Please enter a positive number.");
                }
            }

            // Input years of service with validation
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid years of service! Please enter a valid number.");
                }
            }
        }

        // Calculate bonus, new salary, and total values
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = oldSalary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = oldSalary[i] + bonus[i];

            // Accumulate total values
            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        // Output the results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
