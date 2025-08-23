import java.util.*;

public class rough {
    public static void moveZeroes(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            if (nums[i] == 0) {
                nums[n] = nums[i];
                n--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
    }
}
