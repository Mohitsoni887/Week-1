import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the ages of the three friends
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Take input for the heights of the three friends
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();
        
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();
        
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Find the youngest friend by checking for the smallest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        
        // Determine the name of the youngest friend
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend by checking for the largest height
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        
        // Determine the name of the tallest friend
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Output the results
        System.out.println(youngestFriend + " is the youngest friend with age " + youngestAge + ".");
        System.out.println(tallestFriend + " is the tallest friend with height " + tallestHeight + " cm.");

        // Close the scanner
        sc.close();
    }
}
