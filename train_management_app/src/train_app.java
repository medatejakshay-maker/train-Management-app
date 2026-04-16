import java.util.*;

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // ===== ADD BOGIES =====
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (ignored)

        // ===== DISPLAY FORMATION =====
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(train);

        System.out.println("\nTotal Bogies: " + train.size());

        System.out.println("\nProgram continues...");
    }
}