public class NumberChecker5 {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        
        // Store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The greatest factor is the last element in the array
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        int number = 28; // Test number
        
        System.out.println("Factors of " + number + ": ");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        System.out.println("Product of factors: " + findProductOfFactors(factors));
        System.out.println("Product of cube of factors: " + findProductOfCubeOfFactors(factors));

        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));
    }
}
