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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String original = "radar";

        // Initialize Data Structures
        Queue<Character> queue = new LinkedList<>(); // FIFO
        Stack<Character> stack = new Stack<>();      // LIFO

        // Enqueue and Push characters
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            // Queue.remove() gets the first char, Stack.pop() gets the last char
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is \"" + original + "\" a palindrome? " + isPalindrome);
    }
}