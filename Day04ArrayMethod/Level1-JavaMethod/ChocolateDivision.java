import java.util.Scanner;

public class ChocolateDivision {

    public static int[] findRemainderAndQuotient(int totalChocolates, int numberOfChildren) {
        // Calculate number of chocolates each child will get
        int chocolatesPerChild = totalChocolates / numberOfChildren;
        
        // Calculate the remaining chocolates
        int remainingChocolates = totalChocolates % numberOfChildren;
        
        // Return the results in an array
        return new int[] { chocolatesPerChild, remainingChocolates };
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the total number of chocolates and number of children
        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(totalChocolates, numberOfChildren);

        // Output the results
        System.out.println("Each child gets: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        // Close the scanner
        scanner.close();
    }
}