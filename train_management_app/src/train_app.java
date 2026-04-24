import java.util.*;
import java.util.stream.*;

/**
 * ============================================================
 * MAIN CLASS - train_app
 * ============================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * Compares execution time of loop-based filtering vs stream-based filtering.
 *
 * @version 13.0
 */

public class train_app {

    // Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("=== Performance Comparison: Loop vs Stream ===");

        // User input
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Name: ");
            sc.nextLine(); // consume newline
            String name = sc.nextLine();

            System.out.print("Capacity: ");
            int capacity = sc.nextInt();

            bogies.add(new Bogie(name, capacity));
        }

        // ---------------- LOOP BASED FILTERING ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM BASED FILTERING ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("\n--- Filtered Bogies (Capacity > 60) ---");
        System.out.println("Loop Result: " + loopResult);
        System.out.println("Stream Result: " + streamResult);

        System.out.println("\n--- Performance ---");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Consistency check
        System.out.println("\n--- Result Check ---");
        if (loopResult.size() == streamResult.size()) {
            System.out.println("Both approaches give SAME result ✅");
        } else {
            System.out.println("Mismatch in results ❌");
        }

        sc.close();
    }
}