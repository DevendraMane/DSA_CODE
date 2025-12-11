package Arrays;

import java.util.Arrays;

public class merge_two_sorted_arr {
    public static int[] merge_them(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (k < ans.length) {
            if (i < m && arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                if (j < n) {
                    j++;
                }
            }
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 30, 35, 40 };
        int[] arr2 = { 20, 25, 50 };
        // System.out.print(Arrays.toString(merge_them(arr1, arr2)));
        System.out.print(Arrays.toString(merge_them(arr1, arr2)));
    }
}
