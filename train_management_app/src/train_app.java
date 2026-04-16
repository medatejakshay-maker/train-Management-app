import java.util.*;

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("\nTrain initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}