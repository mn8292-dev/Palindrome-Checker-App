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
            // Hardcoded string
            String original = "racecar";
            String reversed = "";

            // Loop: Iterating from the last index to the first
            for (int i = original.length() - 1; i >= 0; i--) {
                // String Concatenation: Building the reversed string
                reversed = reversed + original.charAt(i);
            }

            // Comparison using .equals() for content check
            if (original.equals(reversed)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }