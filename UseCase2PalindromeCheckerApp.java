public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        String cleanedStr = str.replaceAll("\\W", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        boolean isPalindrome = cleanedStr.equals(reversedStr);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}