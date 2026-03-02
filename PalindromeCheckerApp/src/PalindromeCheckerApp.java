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
        // Hardcoded string (String Literal)
        String original = "madam";

        // Use StringBuilder to reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Conditional Statement to check for equality
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}
