package Arrays;

import java.sql.Time;
import java.util.*;

public class Majority_element {

    // *BrutForce(looping)
    // public static int maj_elem(int[] arr) {
    // int n = arr.length - 1;
    // for (int i = 0; i <= n; i++) {

    // int count = 0;

    // for (int j = 0; j <= n; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // }

    // if (count > (n / 2)) {
    // return arr[i];
    // }
    // }
    // return -1;
    // }

    // *Better(using HashMap:)
    // Time Complexity: O(N*logN) + O(N), where N = size of the given array.
    // Reason: We are using a map data structure. Insertion in the map takes logN
    // time. And we are doing it for N elements. So, it results in the first term
    // O(N*logN). The second O(N) is for checking which element occurs more than
    // floor(N/2) times. If we use unordered_map instead, the first term will be
    // O(N) for the best and average case and for the worst case, it will be O(N2).

    // Space Complexity: O(N) as we are using a map data structure.
    // public static int maj_elem(int[] arr) {
    // int n = arr.length - 1;

    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i <= n; i++) {
    // int val = map.getOrDefault(arr[i], 0);
    // map.put(arr[i], val + 1);
    // }

    // for (Map.Entry<Integer, Integer> it : map.entrySet()) {
    // if (it.getValue() > (n / 2)) {
    // return it.getKey();
    // }
    // }
    // return -1;
    // }

    // * Optimized(Moore's Voting Algo)
    public static int maj_elem(int[] arr) {
        int n = arr.length;
        int elem = 0;
        int count = 0; // 🤔this does not represent anything

        // algorithm
        for (int i = 0; i < n; i++) {

            if (count == 0) {
                count = 1;
                elem = arr[i];
            } else if (elem == arr[i]) {
                count++;
            } else {
                count--;
            }

        }

        // finding if the elem is actually majority or not
        int count1 = 0;
        for (int num : arr) {
            if (num == elem)
                count1++;

        }
        if (count1 > (n / 2)) {
            return elem;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int arr1[] = { 0, 1, 0, 3, 12 };
        int arr2[] = { 3, 2, 3 };
        // System.out.println(maj_elem(arr)); // O(n²)
        System.out.println(maj_elem(arr)); //
        ;
    }
}
