import java.util.Random;

public class RandomValues {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        // Generate random 4-digit numbers and store them in the array
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); // Generate a 4-digit number
        }
        
        return randomNumbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        // Iterate through the array to find the min, max, and sum
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            sum += number;
        }
        
        // Calculate the average
        double average = (double) sum / numbers.length;
        
        // Return the results as an array
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find the average, min, and max values of the array
        double[] result = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Random 4-digit numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        
        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Maximum Value: " + result[2]);
    }
}
