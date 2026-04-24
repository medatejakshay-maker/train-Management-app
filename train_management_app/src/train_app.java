import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - train_app
 * ============================================================
 *
 * Use Case 15: Safe Cargo Assignment using try-catch-finally
 *
 * Description:
 * Handles unsafe cargo assignments at runtime without crashing.
 *
 * @version 15.0
 */

public class train_app {

    // ---------------- CUSTOM RUNTIME EXCEPTION ----------------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---------------- GOODS BOGIE MODEL ----------------
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        // Cargo assignment with validation
        void assignCargo(String cargo) {
            try {
                // Safety rule
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe: Rectangular bogie cannot carry Petroleum"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully ✅");

            } catch (CargoSafetyException e) {
                System.out.println("Error ❌: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }

        public String toString() {
            return type + " -> " + (cargo == null ? "No Cargo" : cargo);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<GoodsBogie> bogies = new ArrayList<>();

        System.out.println("=== Safe Cargo Assignment System ===");

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Create bogies
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter bogie type (Rectangular/Cylindrical): ");
            String type = sc.nextLine();
            bogies.add(new GoodsBogie(type));
        }

        // Assign cargo
        for (int i = 0; i < bogies.size(); i++) {
            System.out.print("Enter cargo for bogie " + (i + 1) + ": ");
            String cargo = sc.nextLine();

            bogies.get(i).assignCargo(cargo);
        }

        // Display final state
        System.out.println("\n--- Final Bogie Status ---");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        sc.close();
    }
}