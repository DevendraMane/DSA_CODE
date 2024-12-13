package Basic.Loops;

public class for_each {
    public static void main(String[] args) {
        // 1. For-each with a 1D integer array
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("For-each with 1D array:");
        for (int num : numbers) { // Iterates over each number in the array
            System.out.println("Number: " + num);
        }

        System.out.println("\n-----------------------------");

        // 2. For-each with a String array
        String[] fruits = { "Apple", "Banana", "Cherry", "Mango" };
        System.out.println("For-each with String array:");
        for (String fruit : fruits) { // Iterates over each fruit in the array
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("\n-----------------------------");

        // 3. For-each with a 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("For-each with 2D array:");
        for (int[] row : matrix) { // Iterates over each row (1D array) in the matrix
            for (int element : row) { // Iterates over each element in the row
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println("\n-----------------------------");

        // 4. Modifying elements using for-each (not possible directly)
        System.out.println("Modifying array elements using normal for loop:");
        for (int i = 0; i < numbers.length; i++) { // Normal for loop for modification
            numbers[i] += 10; // Add 10 to each number
        }
        System.out.println("Modified array:");
        for (int num : numbers) { // Now printing the modified array with for-each
            System.out.println("Number: " + num);
        }

        System.out.println("\n-----------------------------");

        // 5. Read-only nature of for-each
        System.out.println("For-each is read-only:");
        for (int num : numbers) {
            num += 10; // This does NOT modify the original array
        }
        System.out.println("Array after for-each (unchanged):");
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

// todo: Points to consider=

// 1. 1D Array:
// for (int num : numbers) goes through each element in the numbers array one by
// one.
// You can print each element directly.

// 2. String Array:
// Similar to 1D array, but here we iterate over String elements instead of int.

// 3. 2D Array:
// The outer loop iterates over rows (each row is a 1D array).
// The inner loop iterates over elements in each row.

// 4. Modifying Elements:
// You cannot modify elements directly using for-each loop.
// A normal for loop is required to modify array elements.

// 5. Read-only Nature:
// Changes made to the num variable in for-each do not affect the actual array.
// This shows that for-each is read-only and cannot modify the array elements.