package Arrays;

import java.util.*;

public class Majority_element {

    // *BrutForce(looping)
    public static int maj_elem(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {

            int count = 0;

            for (int j = 0; j <= n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int arr1[] = { 0, 1, 0, 3, 12 };
        int arr2[] = { 1, 0, 1 };
        // System.out.println(maj_elem(arr)); // O(n²)
        System.out.println(maj_elem(arr)); //
        ;
    }
}
