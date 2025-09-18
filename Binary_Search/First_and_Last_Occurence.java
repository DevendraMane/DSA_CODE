package Binary_Search;

import java.util.*;

public class First_and_Last_Occurence {
    // *BrutForce
    public static int[] Occurrence_BrutForce(int[] array, int target) {
        // !Try to do it with ArrayList
        int first_index = -1; // ? considering target doesn't exist
        int last_index = -1; // ? considering target doesn't exist
        int n = array.length - 1;

        for (int i = 0; i <= n; i++) {
            if (array[i] == target) {

                if (first_index == -1) {
                    first_index = i;
                }
                last_index = i;
            }
        }

        return new int[] { first_index, last_index };
        // return last_index;

    }

    // *With Binary Search
    public static int[] Occurrence_Binary_Search(int[] array, int target) {
        // !Try to do it with ArrayList
        int first_index = -1; // ? considering target doesn't exist
        int last_index = -1; // ? considering target doesn't exist
        int n = array.length - 1;
        int lo = 0, hi = n;
        int lo1 = 0, hi1 = n;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (array[mid] < target) {
                lo = mid + 1;
            } else if (array[mid] > target) {
                hi = mid - 1;
            }
            if (array[mid] == target) {
                first_index = mid;
                hi = mid - 1;
            }
        }
        while (lo1 <= hi1) {
            int mid = (lo1 + hi1) / 2;

            if (array[mid] < target) {
                lo1 = mid + 1;
            } else if (array[mid] > target) {
                hi1 = mid - 1;
            }
            if (array[mid] == target) {
                last_index = mid;
                lo1 = mid + 1;
            }
        }

        return new int[] { first_index, last_index };
        // return last_index;

    }

    public static void main(String[] args) {
        int target = 1;
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 8, 9 };
        int arrForBS[] = { 1, 1, 2, 3, 3, 4 };
        System.out.println(Arrays.toString(Occurrence_BrutForce(arr, target))); // O(n)
        System.out.println(Arrays.toString(Occurrence_Binary_Search(arr, target)));// O(log n)
        // System.out.println(Occurrence(arr, target));
    }
}
