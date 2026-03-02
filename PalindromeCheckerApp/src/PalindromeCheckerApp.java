/*
 *Use Case 1: Application Entry and Welcome Message
 *
 * Description:
 * A Palindrome Checker App
 *
 * At this stage the application:
 * starts execution form the main() methode.
 * Display
 *
 * RA2411030010302 Developer
 * @Version 1.0
 */
public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "A man, a plan, a canal: Panama";

            // 1. Normalization: Remove non-alphanumeric characters and lowercase
            // Using Regular Expression: [^a-zA-Z0-9] means "anything NOT a letter or number"
            String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // 2. Apply logic (Two-Pointer approach for efficiency)
            boolean isPalindrome = checkPalindrome(cleanString);

            System.out.println("Original: " + input);
            System.out.println("Normalized: " + cleanString);
            System.out.println("Is Palindrome? " + isPalindrome);
        }

        public static boolean checkPalindrome(String str) {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
    }