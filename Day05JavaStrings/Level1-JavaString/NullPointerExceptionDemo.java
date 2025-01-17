public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        // Call the method to generate NullPointerException
        generateNullPointerException();
        
        // Refactor the code to handle NullPointerException using try-catch block
        handleNullPointerException();
    }

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This line will throw NullPointerException because text is null
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        String text = null;

        try {
            // Attempting to access a method on null will throw NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught a NullPointerException: Cannot call methods on a null object.");
        }
    }
}
