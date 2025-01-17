import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); // Read input as a double
        // Convert kilometers to miles using the formula: 1 mile = 1.6 km
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles +"miles for the given" +  km + " km ");
    }
}