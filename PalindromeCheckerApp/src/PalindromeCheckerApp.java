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
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "rotator";
        Node head = buildList(str);

        if (isPalindrome(head)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Find Middle (Fast & Slow Pointers)
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse Second Half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // 3. Compare Halves
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data) return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static Node buildList(String s) {
        Node dummy = new Node(' ');
        Node curr = dummy;
        for (char c : s.toCharArray()) {
            curr.next = new Node(c);
            curr = curr.next;
        }
        return dummy.next;
    }
}