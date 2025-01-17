public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method to test the unit conversions
    public static void main(String[] args) {
        // Test conversions
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("37 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("150 Pounds to Kilograms: " + convertPoundsToKilograms(150));
        System.out.println("68 Kilograms to Pounds: " + convertKilogramsToPounds(68));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("50 Liters to Gallons: " + convertLitersToGallons(50));
    }
}
