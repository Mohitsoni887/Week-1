import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
        (month == 4 && day >= 1 && day <= 30) ||  // April
        (month == 5 && day >= 1 && day <= 31) ||  // May
        (month == 6 && day >= 1 && day <= 20);    // June 1 to June 20

        // Output result
        if (isSpring) {
           System.out.println("It's a Spring Season.");
        } else {
           System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
