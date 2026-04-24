import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - train_app
 * ============================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * Prevents creation of passenger bogies with invalid capacity.
 *
 * @version 14.0
 */

public class train_app {

    // ---------------- CUSTOM EXCEPTION ----------------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---------------- PASSENGER BOGIE MODEL ----------------
    static class PassengerBogie {
        String name;
        int capacity;

        // Constructor with validation
        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<PassengerBogie> bogies = new ArrayList<>();

        System.out.println("=== Passenger Bogie Creation with Validation ===");

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEnter details for Bogie " + (i + 1));

                System.out.print("Name: ");
                sc.nextLine(); // consume newline
                String name = sc.nextLine();

                System.out.print("Capacity: ");
                int capacity = sc.nextInt();

                // Attempt to create bogie
                PassengerBogie b = new PassengerBogie(name, capacity);
                bogies.add(b);

                System.out.println("Bogie added successfully ✅");

            } catch (InvalidCapacityException e) {
                System.out.println("Error ❌: " + e.getMessage());
                i--; // retry same index
            }
        }

        // Display valid bogies
        System.out.println("\n--- Valid Bogies ---");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        sc.close();
    }
}