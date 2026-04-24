package train_app;

import java.util.Arrays;
import java.util.Scanner;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC19: Binary Search for Bogie ID");
        System.out.println();

        // Step 1: Create an array (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort the array (mandatory for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 3: Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Binary Search logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                System.out.println("Bogie Found at position: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("Bogie ID not found in the train consist.");
        }

        sc.close();
    }
}