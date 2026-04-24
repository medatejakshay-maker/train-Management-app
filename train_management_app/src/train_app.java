/**
 * ==========================================================
 * MAIN CLASS - UseCase16TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 *
 * Description:
 * This class demonstrates manual sorting using Bubble Sort
 * without using built-in Java sorting methods.
 *
 * ==========================================================
 */

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC16: Bubble Sort - Passenger Bogie Capacities\n");

        // Step 1: Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Step 2: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);
    }

    // Bubble Sort Logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}