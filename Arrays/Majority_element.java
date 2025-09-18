package Arrays;

import java.util.*;

public class Majority_element {
    public static void moveZeroes(int[] nums) {
        int start = 0, end = 1;

        while (start < nums.length && end < nums.length) {
            if ((end == nums.length - 1) && (nums[end] == 0) && (nums[start] == 0)) {
                break;
            }
            if (nums[end] == 0) {
                if (end < nums.length - 1) {
                    end++;
                }

            } else if (nums[end] != 0 && nums[start] == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                if (start < nums.length) {

                }
                start++;
                end++;
            }
            if (nums[start] != 0 && nums[end] == 0) {
                start++;
            }

            if ((nums[start] != 0 && nums[end] != 0) && (start < nums.length && end != nums.length - 1)) {
                start++;
                end++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesNitaj(int[] nums) {
        int n = nums.length;
        int s = 0, e = 1;

        while (s < n && e < n) {
            if (nums[s] != 0 && nums[e] != 0) {
                if (s + 1 < n && nums[s + 1] == 0 && nums[e] != 0) {
                    s++;
                    int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;
                } else {
                    s++;
                    e++;
                }
            }
            if (nums[s] != 0 && nums[e] == 0) {
                while (e < n && nums[e] != 0) {
                    e++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
        int arr1[] = { 0, 1, 0, 3, 12 };
        int arr2[] = { 1, 0, 1 };
        moveZeroes(arr2);
    }
}
