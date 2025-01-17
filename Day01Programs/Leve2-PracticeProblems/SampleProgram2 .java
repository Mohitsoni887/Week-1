import java.util.Scanner;

public class SampleProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your city of departure: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the city you're passing through: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter your destination city: ");
        String toCity = sc.nextLine();

        // Distances in miles
        System.out.print("Enter the distance from your city to via city (in miles): ");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter the distance from via city to destination (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();

        // Time taken
        System.out.print("Enter the total time taken (in hours): ");
        double timeTaken = sc.nextDouble();

        // Integer operations
        System.out.print("Enter a fee value: ");
        int fee = sc.nextInt();
        System.out.print("Enter a discount percent: ");
        int discountPercent = sc.nextInt();

        int operation1 = fee + discountPercent * 2;  // Fee + DiscountPercent × 2
        int operation2 = fee * discountPercent + 5; // Fee × DiscountPercent + 5
        int operation3 = (int) (fee / 2.0 + discountPercent); // Fee ÷ 2 + DiscountPercent

        // Print results
        System.out.println("\nTraveler Details:");
        System.out.println(name + " traveled from " + fromCity + " to " + toCity 
                + " via " + viaCity + ", covering a total distance of " 
                + (distanceFromToVia + distanceViaToFinalCity) + " miles in " + timeTaken + " hours.");
        
        System.out.println("\nThe results of Int Operations are " + operation1 
                + ", " + operation2 + ", and " + operation3 + ".");
    }
}
