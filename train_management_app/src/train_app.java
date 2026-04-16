import java.util.*;
import java.util.stream.*;

// ===============================
// Bogie Class
// ===============================
class Bogie {
    String name;
    int capacity;
    String type; // Passenger / Goods

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
        bogies.add(new Bogie("Cargo Cylindrical", 120, "Goods"));

        // ===== GROUPING =====
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // ===== DISPLAY GROUPED DATA =====
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("\nCategory: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                b.display();
            }
        }

        // ===== VERIFY ORIGINAL LIST =====
        System.out.println("\nOriginal List (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}