
// //Approach 1: Using Multiple if-else Statements
// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take input year
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         // Ensure the year is greater than or equal to 1582 (Gregorian Calendar)
//         if (year < 1582) {
//             System.out.println("Year must be 1582 or later.");
//         } else {
//             // Check for leap year using multiple if-else statements
//             if (year % 400 == 0) {
//                 System.out.println(year + " is a Leap Year.");
//             } else if (year % 100 == 0) {
//                 System.out.println(year + " is not a Leap Year.");
//             } else if (year % 4 == 0) {
//                 System.out.println(year + " is a Leap Year.");
//             } else {
//                 System.out.println(year + " is not a Leap Year.");
//             }
//         }

//         sc.close();
//     }
// }

//Approach 2: Using a Single if Statement with Logical Operators
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Ensure the year is greater than or equal to 1582 (Gregorian Calendar)
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Check for leap year using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}

