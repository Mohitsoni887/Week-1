import java.util.*;
public class IllegalArgumentExceptionDemo{
    public static void main(String[] args){
    // Call the method to generate IllegalArgumentException
    generateIllegalArgumentException();

    // Call the method to handle IllegalArgumentException
    handleIllegalArgumentException();
    }
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();

        System.out.println("Substring: "+ str.substring(5,3)); //Invalid Indices:- Because start index is greater than the end Index...
    }
    // Method to handle IllegalArgumentException using try-catch
    public static void handleIllegalArgumentException(){
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String str = input.next();

        try{
            System.out.println("Substring: "+ str.substring(5,3)); 
        }
        catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}