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
 *
 */

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String original = "deified";

            // Convert string to character array
            char[] charArray = original.toCharArray();

            boolean isPalindrome = true;
            int start = 0;
            int end = charArray.length - 1;

            // Two-Pointer Technique
            while (start < end) {
                // Compare characters at both ends
                if (charArray[start] != charArray[end]) {
                    isPalindrome = false;
                    break; // Exit early if a mismatch is found
                }
                start++; // Move forward
                end--;   // Move backward
            }

            if (isPalindrome) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }