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
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String original = "racecar";
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to the Deque
        for (char c : original.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Process until 0 or 1 character remains
        while (deque.size() > 1) {
            // Remove from both ends and compare
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is \"" + original + "\" a palindrome? " + isPalindrome);
    }
}