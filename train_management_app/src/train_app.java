import java.util.*;
import java.util.stream.*;

// ===============================
// Bogie Class
// ===============================
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ===== ORIGINAL LIST =====
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }

        // ===== STREAM FILTER =====
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // ===== DISPLAY FILTERED RESULT =====
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        // ===== VERIFY ORIGINAL LIST UNCHANGED =====
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}