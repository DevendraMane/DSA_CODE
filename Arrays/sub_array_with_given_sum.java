package Arrays;

import java.util.HashMap;

public class sub_array_with_given_sum {
    // * this is the brutforce method:
    // public static int sub_array(int[] arr, int sum) {
    // int l = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int S = 0;
    // for (int j = i; j < arr.length; j++) {
    // S += arr[j];
    // if (S == sum) {
    // l = Math.max(l, j - i + 1);
    // }
    // }
    // }
    // return l;
    // }

    // *Prefix sum and HashMap method: (Better)
    // public static int sub_array(int[] arr, int k) {
    // int maxL = 0;
    // int sum = 0;

    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];

    // if (sum == k) {
    // maxL = i + 1;
    // }

    // if (map.containsKey(sum - k)) {
    // maxL = Math.max(maxL, i - map.get(sum - k));
    // }

    // if (!map.containsKey(sum)) {
    // map.put(sum, i);
    // }
    // }
    // return maxL;
    // }

    // *two pointer approach
    // !Only for positive numbers
    public static int sub_array(int arr[], int k) {
        int left = 0, right = 0, sum, maxL = 0;
        sum = arr[0];

        while (right < arr.length - 1) {
            right++;

            if (right < arr.length) {
                sum += arr[right];
            }

            if (sum == k) {
                maxL = Math.max(maxL, right - left + 1);
            }

            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }

        }
        return maxL;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int k = 6;
        System.out.println(sub_array(arr, k));
    }
}
