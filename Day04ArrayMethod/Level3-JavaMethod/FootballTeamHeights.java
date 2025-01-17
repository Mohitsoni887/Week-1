import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate the sum of all elements in the array
    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double findMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height in the array
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int value : array) {
            if (value < shortest) {
                shortest = value;
            }
        }
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int value : array) {
            if (value > tallest) {
                tallest = value;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an array to store heights of 11 players
        int[] heights = new int[11];

        // Generate random heights for each player in the range 150 cm to 250 cm
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random number between 150 and 250
        }

        // Display the heights of the players
        System.out.println("Heights of players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
