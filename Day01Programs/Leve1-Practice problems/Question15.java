// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " for a quantity of " + quantity + " at a unit price of INR " + unitPrice);
    }
}
