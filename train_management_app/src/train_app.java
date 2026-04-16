import java.util.*;

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ===== ADD IDs (including duplicates) =====
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // ===== DISPLAY UNIQUE IDs =====
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIDs);

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());

        System.out.println("\nProgram continues...");
    }
}