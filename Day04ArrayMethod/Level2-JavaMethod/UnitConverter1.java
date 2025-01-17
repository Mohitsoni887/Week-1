public class UnitConverter {
    // Method to convert Kilometers to Miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Method to convert Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Method to convert Meters to Feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Method to convert Feet to Meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 Kilometers to Miles: " + convertKmToMiles(10));
        System.out.println("50 Miles to Kilometers: " + convertMilesToKm(50));
        System.out.println("10 Meters to Feet: " + convertMetersToFeet(10));
        System.out.println("30 Feet to Meters: " + convertFeetToMeters(30));
    }
}
