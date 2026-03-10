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
import java.util.Stack;

public class PalindromeCheckerAppgit checkout main
gi{

    /**
     * Core logic using a Stack (LIFO) to validate the string.
     * Encapsulation: The internal data structure (Stack) is hidden from the caller.
     */
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Standardize: Remove spaces/punctuation and normalize case
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Data Structure: Using a Stack to reverse the string
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all chars onto the stack
        for (int i = 0; i < cleanInput.length(); i++) {
            stack.push(cleanInput.charAt(i));
        }

        // Step 2: Pop and compare
        for (int i = 0; i < cleanInput.length(); i++) {
            if (cleanInput.charAt(i) != stack.pop()) {
                return false; // Not a palindrome
            }
        }

        return true; // All characters matched
    }
}