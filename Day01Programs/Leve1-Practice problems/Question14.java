// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3.0;
        double distanceMiles = distanceYards / 1760.0;

        System.out.println("The distance is " + distanceYards + " yards and " + distanceMiles + " miles for the given " + distanceFeet + " feet");
    }
}
