import java.util.*;

public class rough {
    public static int[] subArray(int[] nums, int key) {
        int start = 0;
        int end = 0;
        int sum = nums[0];

        while (end < nums.length) {
            end++;

            if (end < nums.length) {
                sum += nums[end];
            }

            while (sum > key) {
                sum -= nums[start];
                start++;
            }

            if (sum == key) {
                return Arrays.copyOfRange(nums, start, end + 1);
            }

        }
        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int key = 33;
        System.out.println(Arrays.toString(subArray(arr, key)));
        ;
    }
}
