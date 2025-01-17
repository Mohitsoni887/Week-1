public class ZaraBonus {

    // Method to generate a random salary and years of service
    public static int[][] generateEmployeeData() {
        int[][] employeeData = new int[10][2]; // 2D array: first column for salary, second for years of service

        // Generate random salary and years of service
        for (int i = 0; i < 10; i++) {
            int salary = (int) (Math.random() * 90000) + 10000; // Random salary between 10000 and 99999
            int yearsOfService = (int) (Math.random() * 15);  // Random years of service between 0 and 14
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static int[][] calculateBonus(int[][] employeeData) {
        int[][] updatedData = new int[10][3]; // 2D array to store old salary, bonus, and new salary

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService >= 5) ? 0.05 : 0.02;  // 5% bonus if years of service >= 5, else 2%

            double bonus = salary * bonusPercentage;
            int newSalary = (int) (salary + bonus);

            updatedData[i][0] = salary;  // Old salary
            updatedData[i][1] = (int) bonus;  // Bonus amount
            updatedData[i][2] = newSalary;  // New salary after bonus
        }

        return updatedData;
    }

    // Method to calculate total old salary, new salary, and total bonus
    public static void calculateTotal(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        // Calculate totals
        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
        }

        // Display the totals
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    // Method to display the salary data in tabular format
    public static void displayTable(int[][] updatedData) {
        System.out.println("Employee | Old Salary | Bonus | New Salary");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%8d | %10d | %5d | %10d\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
    }

    public static void main(String[] args) {
        // Generate employee data
        int[][] employeeData = generateEmployeeData();

        // Calculate bonus and new salary
        int[][] updatedData = calculateBonus(employeeData);

        // Display the salary details in tabular format
        displayTable(updatedData);

        // Calculate and display the total amounts
        calculateTotal(updatedData);
    }
}
