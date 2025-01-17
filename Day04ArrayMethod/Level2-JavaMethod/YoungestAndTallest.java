import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend based on age
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        // Compare ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend based on height
    public static String findTallest(int[] heights, String[] names) {
        int tallestHeight = heights[0];
        String tallestFriend = names[0];

        // Compare heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the names, ages, and heights of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Get user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        // Find the youngest and tallest friends
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}
