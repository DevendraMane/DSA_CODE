package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//? Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

public class find_disappeared_no {
    // public static List<Integer> Solution(int[] arr) {
    public static void Solution(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -1 * arr[index];
            }
        }
        System.out.print(Arrays.toString(arr));

        // List<Integer> result = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > 0) {
        // result.add(i + 1);
        // }
        // }

        // return result;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 4, 4, 4 };
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // System.out.print(Solution(arr));
        Solution(arr);
        ;
    }
}
