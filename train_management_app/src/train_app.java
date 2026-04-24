package train_app;

import java.util.Scanner;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC18: Linear Search for Bogie ID");
        System.out.println();

        // Step 1: Create an array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Take user input for search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Perform Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // Early termination
            }
        }

        // Step 4: Display result if not found
        if (!found) {
            System.out.println("Bogie ID not found in the train consist.");
        }

        sc.close();
    }
}