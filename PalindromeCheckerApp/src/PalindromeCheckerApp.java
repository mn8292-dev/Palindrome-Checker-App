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
import java.util.Stack;

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String original = "level";
            Stack<Character> stack = new Stack<>();

            // 1. Push: Insert all characters into the stack
            for (int i = 0; i < original.length(); i++) {
                stack.push(original.charAt(i));
            }

            String reversed = "";

            // 2. Pop: Remove characters (this naturally reverses the order)
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            // 3. Compare and Print
            if (original.equals(reversed)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }