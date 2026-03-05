import java.util.Scanner;

/**
 * UC4: Character Array Based Palindrome Check
 * Goal: Convert string to character array and compare characters using two-pointer technique.
 * Data Structure: char[]
 */
public class UseCase4PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        // Convert string to character array
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        // Two-pointer approach: compare start & end characters
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC4 - Char Array): ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}
