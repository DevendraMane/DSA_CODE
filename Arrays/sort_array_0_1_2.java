package Arrays;

import java.util.Arrays;

public class sort_array_0_1_2 {

    // Method - 1
    public static void sortColors1(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;
            } else if (nums[i] == 1) {
                c1++;
            } else if (nums[i] == 2) {
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            nums[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            nums[i] = 1;
        }
        for (int i = c0 + c1; i < nums.length; i++) {
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }

    // Method - 2(Dutch National Flag)
    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void sortColors2(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        // in between mid and high(unsorted part)
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        sortColors2(arr);
    }
}
