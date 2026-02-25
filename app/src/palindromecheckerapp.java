public class palindromecheckerapp {


        // Use Case Logic Method
        public static boolean isPalindrome(String input) {

            if (input == null) {
                return false;
            }

            // Remove spaces and convert to lowercase
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        // Main method to test
        public static void main(String[] args) {

            String testWord = "Madam";

            if (isPalindrome(testWord)) {
                System.out.println(testWord + " is a Palindrome.");
            } else {
                System.out.println(testWord + " is NOT a Palindrome.");
            }
        }
    }

