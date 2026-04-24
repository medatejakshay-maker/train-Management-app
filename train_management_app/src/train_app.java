package train_app;

import java.util.Scanner;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC20: Exception Handling During Search Operations");
        System.out.println();

        // Step 1: Create bogie array (try empty {} to test exception)
        String[] bogieIds = {}; // change to {"BG101","BG205","BG309"} to test normal flow

        Scanner sc = new Scanner(System.in);

        try {
            // Step 2: Fail-fast validation
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available. Cannot perform search.");
            }

            // Step 3: Take user input
            System.out.print("Enter Bogie ID to search: ");
            String key = sc.nextLine();

            // Step 4: Perform Linear Search (after validation)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // Step 5: Display result
            if (found) {
                System.out.println("Bogie Found in the train consist.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // Step 6: Handle exception gracefully
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Step 7: Always executes
            System.out.println("Search operation completed.");
            sc.close();
        }
    }
}