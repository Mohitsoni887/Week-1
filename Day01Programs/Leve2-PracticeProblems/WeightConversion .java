import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        double weightKg = weightPounds / 2.2;

        System.out.println("The weight of the person in pounds is " + weightPounds 
                + " and in kilograms is " + weightKg);
    }
}
