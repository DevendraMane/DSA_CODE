package Arrays;

import java.util.*;

public class largest_num {
    public static int largest(int nums[]) {
        int largest_num = Integer.MIN_VALUE; // -infinity
        // ↓ loop for scanning the given array↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest_num) {
                largest_num = nums[i];
            }
        }
        return largest_num;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 4, 8, 5 };
        int getLargest = largest(nums);
        System.out.print("The largest num is: " + getLargest);
    }
}
