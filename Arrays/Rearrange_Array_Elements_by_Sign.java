package Arrays;
//?Q. You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// You should return the array of nums such that the the array follows the given conditions:
// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

public class Rearrange_Array_Elements_by_Sign {
    // *Brutforce
    // public static int[] Solution(int arr[]) {
    // int n = arr.length;
    // ArrayList<Integer> positive = new ArrayList<>();
    // ArrayList<Integer> negative = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    // if (arr[i] > 0) {
    // positive.add(arr[i]);
    // } else
    // negative.add(arr[i]);
    // }

    // for (int i = 0; i < n / 2; i++) {
    // arr[2 * i] = positive.get(i);
    // arr[2 * i + 1] = negative.get(i);
    // }
    // return arr;
    // }

    // *Mine 🤔
    // public static int[] Solution(int arr[]) {

    // int i = 0, k = 0, n = arr.length - 1, j = n, e = n;
    // int[] copy_arr = new int[arr.length];

    // boolean toggle = false;
    // if (arr[i] > 0 && arr[j] < 0) {
    // toggle = true;
    // copy_arr[k] = arr[i];
    // copy_arr[e] = arr[j];
    // i++;
    // k++;
    // j--;
    // e--;
    // } else if (toggle && arr[i] < 0 && arr[j] > 0) {
    // int temp = arr[i + 1];
    // arr[i + 1] = arr[i];
    // arr[i] = temp;
    // copy_arr[k] = arr[i];
    // i++;
    // k++;
    // int temp1 = arr[j - 1];
    // arr[j - 1] = arr[j];
    // arr[j] = temp1;
    // copy_arr[e] = arr[j];
    // j--;
    // e--;

    // } else
    // toggle = false;

    // // if 1st elem is a +ve no. then keep it at 0-index
    // // if (i == 0 && arr[i] > 0 && arr[j] < 0) {

    // // k++;
    // // i++;
    // // j--;
    // // e--;
    // // } else if()
    // return copy_arr;
    // // return {};
    // }

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr[even] = nums[i];
                even = even + 2;
            } else {
                arr[odd] = nums[i];
                odd = odd + 2;
            }
        }
        return nums;
    }

    // return arr;
    // }
    // }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
