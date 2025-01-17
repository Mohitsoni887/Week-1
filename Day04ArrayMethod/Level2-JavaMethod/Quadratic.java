import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        // If delta is zero, there is exactly one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };  // One root
        } 
        // If delta is negative, there are no real roots
        else {
            return new double[] {};  // No real roots
        }
    }

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for coefficients a, b, and c
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Get the roots using the method
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 2) {
            System.out.println("The roots of the quadratic equation are:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the quadratic equation is:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("There are no real roots.");
        }

        // Close the scanner
        scanner.close();
    }
}
