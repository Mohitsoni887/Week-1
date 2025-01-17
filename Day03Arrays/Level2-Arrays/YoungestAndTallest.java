import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store age and height for 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input age and height for the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            age[i] = scanner.nextInt();

            System.out.print("Enter height for " + names[i] + ": ");
            height[i] = scanner.nextDouble();
        }

        // Variables to track the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and the tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + height[tallestIndex]);

        scanner.close();
    }
}
