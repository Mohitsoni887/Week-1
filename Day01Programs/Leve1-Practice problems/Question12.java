// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        double heightInCm, heightInInches;
        int heightInFeet; // Whole number for feet
        double remainingInches; // Remaining inches after converting to feet

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        heightInCm = input.nextDouble(); // Taking input for height in centimeters

        // Conversions
        heightInInches = heightInCm / 2.54; // 1 inch = 2.54 cm
        heightInFeet = (int) (heightInInches / 12); // Calculate feet (integer part)
        remainingInches = heightInInches % 12; // Remaining inches

        // Output
        System.out.println("Your height in cm is " + heightInCm + ", in feet is " 
                           + heightInFeet + " feet and " + remainingInches + " inches.");
    }
}

