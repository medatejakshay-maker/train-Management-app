package train_app;

import java.util.Arrays;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC17: Sort Bogie Names Using Arrays.sort()");
        System.out.println();

        // Step 1: Create an array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Display original array
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Display sorted array
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}