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
import java.util.ArrayList;
import java.util.List;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Create a large palindrome to make the performance gap measurable
        String base = "racecar".repeat(1000);
        String testString = base + "a" + new StringBuilder(base).reverse().toString();

        // List of strategies to compare
        List<PalindromeStrategy> strategies = new ArrayList<>();
        strategies.add(new StackStrategy());
        strategies.add(new DequeStrategy());
        strategies.add(new TwoPointerStrategy());

        System.out.println("=== UC13: Performance Comparison ===");
        System.out.printf("%-20s | %-15s | %-10s%n", "Algorithm", "Time (ns)", "Result");
        System.out.println("------------------------------------------------------------");

        for (PalindromeStrategy strategy : strategies) {
            benchmark(strategy, testString);
        }
    }

    private static void benchmark(PalindromeStrategy strategy, String input) {
        // JVM Warm-up: execute a few times so the JIT compiler optimizes the code
        for (int i = 0; i < 100; i++) strategy.isValid(input);

        // Capture Start Time
        long start = System.nanoTime();

        boolean result = strategy.isValid(input);

        // Capture End Time
        long end = System.nanoTime();

        long duration = end - start;

        System.out.printf("%-20s | %-15d | %-10s%n",
                strategy.getClass().getSimpleName(),
                duration,
                result ? "Valid" : "Invalid");
    }
}