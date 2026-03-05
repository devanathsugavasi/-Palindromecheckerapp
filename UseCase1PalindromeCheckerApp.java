public class UseCase1PalindromeCheckerApp {
    
    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0";
    
    public static void main(String[] args) {
        displayWelcomeMessage();
    }
    
    /**
     * Displays the welcome message with application details at startup
     */
    private static void displayWelcomeMessage() {
        System.out.println("================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + APP_VERSION);
        System.out.println("================================");
        System.out.println("This application validates whether a given string is a palindrome.");
        System.out.println("================================");
    }
}