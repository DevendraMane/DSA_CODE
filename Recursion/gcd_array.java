package Recursion;

public class gcd_array {
    public static int findGCD_helper(int small, int large) {

        if (small == 0) {
            return large;
        }

        return findGCD_helper(large % small, small);
    }

    public static void findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            small = Math.min(nums[i], small);
            large = Math.max(nums[i], large);
        }

        // return findGCD_helper(small, large);
        System.out.println(small);
        System.out.print(large);
    }

    public static void main(String[] args) {
        findGCD(new int[] { 2, 5, 6, 9, 10 });
    }
}
