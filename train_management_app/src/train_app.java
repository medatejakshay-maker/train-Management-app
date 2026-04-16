import java.util.*;

// ===============================
// Bogie Class (Custom Object)
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

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // ===== ADD BOGIES =====
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // ===== SORT USING COMPARATOR =====
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ===== DISPLAY SORTED LIST =====
        System.out.println("\nBogies Sorted by Capacity (Ascending):");

        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}