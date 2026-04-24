import java.util.*;
import java.util.stream.*;

// ===============================
// Bogie Class
// ===============================
class Bogie {
    String name;
    int capacity;
    String type;

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public void display() {
        System.out.println(name + " (" + type + ") -> Capacity: " + capacity);
    }
}

// ===============================
// Main Class
// ===============================
public class train_app {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ===== CREATE LIST =====
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 54, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo Rectangular", 100, "Goods"));

        // ===== DISPLAY ALL =====
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }

        // ===== AGGREGATION USING STREAM =====
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // ===== DISPLAY RESULT =====
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // ===== VERIFY ORIGINAL LIST =====
        System.out.println("\nOriginal List (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}