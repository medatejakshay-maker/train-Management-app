import java.util.*;
import java.util.stream.*;

/**
 * ============================================================
 * MAIN CLASS - train_app
 * ============================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * @version 12.0
 */

public class train_app {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<GoodsBogie> bogieList = new ArrayList<>();

        System.out.println("=== Safety Compliance Check for Goods Bogies ===");

        // Input
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Type (Cylindrical/Open/Box): ");
            String type = sc.nextLine();

            System.out.print("Cargo: ");
            String cargo = sc.nextLine();

            bogieList.add(new GoodsBogie(type, cargo));
        }

        // Display
        System.out.println("\n--- Bogie List ---");
        for (GoodsBogie b : bogieList) {
            System.out.println(b);
        }

        // Safety Rule using Stream
        boolean isSafe = bogieList.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical") ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );

        // Result
        System.out.println("\n--- Safety Status ---");
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
            System.out.println("Rule: Cylindrical bogies must carry Petroleum only.");
        }

        sc.close();
    }
}