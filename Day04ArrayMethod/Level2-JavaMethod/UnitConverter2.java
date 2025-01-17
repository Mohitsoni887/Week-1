public class UnitConverter2 {
    // Method to convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Method to convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Method to convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Method to convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Method to convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Main method to test the unit conversions
    public static void main(String[] args) {
        
        // Additional tests for the new methods
        System.out.println("20 Yards to Feet: " + convertYardsToFeet(20));
        System.out.println("60 Feet to Yards: " + convertFeetToYards(60));
        System.out.println("5 Meters to Inches: " + convertMetersToInches(5));
        System.out.println("100 Inches to Meters: " + convertInchesToMeters(100));
        System.out.println("50 Inches to Centimeters: " + convertInchesToCentimeters(50));
    }
}
