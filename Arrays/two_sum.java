package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Strings.string_compression;

public class two_sum {
    // !Only useful for contiguous subarray
    // * Method 1: Two Pointers
    // public static int[] sum_array(int arr[], int target) {
    // int sum = arr[0];
    // int start = 0;
    // int end = 0;

    // while (end < arr.length) {
    // end++;

    // if (end < arr.length) {
    // sum += arr[end];
    // }

    // if (sum == target) {
    // return new int[] { start, end };
    // } else {
    // sum -= arr[start];
    // start++;
    // }
    // }
    // return new int[0];
    // }

    // * Method 2: By using Hashing
    public static int[] sum_array(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.putIfAbsent(arr[i], i);
        }
        return new int[0];

    }

    public static void main(String[] args) {
        int arr[] = { 3, 3 };
        int target = 6;

        System.out.print(Arrays.toString(sum_array(arr, target)));
    }
}
