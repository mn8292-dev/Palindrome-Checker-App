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
        String original = "kayak";

        if (isPalindrome(original, 0, original.length() - 1)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Base Condition 1: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at current pointers don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Move inward and check the substring
        return isPalindrome(str, start + 1, end - 1);
    }
}