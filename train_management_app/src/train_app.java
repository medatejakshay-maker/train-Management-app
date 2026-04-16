import java.util.*;

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ===== ADD BOGIES =====
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // ===== INSERT IN MIDDLE =====
        train.add(2, "Pantry"); // position 2

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // ===== REMOVE FIRST & LAST =====
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // ===== FINAL STATE =====
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nProgram continues...");
    }
}
