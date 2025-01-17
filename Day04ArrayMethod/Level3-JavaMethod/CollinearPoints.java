import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for three points
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using the slope formula
        if (arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if the points are collinear using the area formula
        if (arePointsCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area formula.");
        } else {
            System.out.println("The points are not collinear using the area formula.");
        }

        scanner.close();
    }
}
