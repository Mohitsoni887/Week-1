// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class Question7{
    public static void main(String[] args) {
        // Define constants
        double radiusKm = 6378.0; // Radius of Earth in kilometers
        double kmToMiles = 0.621371; // Conversion factor: 1 kilometer = 0.621371 miles

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3  + " and in cubic miles is " +  volumeMiles3);
    }
}
