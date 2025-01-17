public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to check if all OTP numbers in the array are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // If any OTP is repeated, return false
                }
            }
        }
        return true; // All OTPs are unique
    }

    // Main method to generate 10 OTP numbers and validate uniqueness
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Validate if all OTP numbers are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicated.");
        }
    }
}
