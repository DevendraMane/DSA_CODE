package Arrays;

import java.util.Arrays;

public class max_sub_array_sum {
    // *Brut force method: O(n³)
    public static void M1_SumSubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                currSum = 0; // { 2, 4, 6, 8, 10 }
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]);
                    currSum = currSum + arr[k];
                }
                // System.out.println
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println(currSum);
            }

        }
        System.out.println(maxSum);
    }

    // *Prefix method: O(n²)
    public static void M2_SumSubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // prefix array code:
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix Array: " + Arrays.toString(prefix));

        for (int i = 0; i <= arr.length - 1; i++) {
            int start = i;
            for (int j = i; j <= arr.length - 1; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // System.out.println
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println(currSum);
            }

        }
        System.out.println("The max sum is:" + maxSum);
    }

    // *Kadan's Algorithm: O(n)
    public static void M3_SumSubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // *Special case (if all the nums in array are negative):
        // todo: ↑Solve this 1st ↑
        for (int i = 0; i <= arr.length - 1; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);

        }
        System.out.println("The max sum is:" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // *Brut force method: O(n³)
        // M1_SumSubArrays(arr);

        // *Prefix method: O(n²)
        // M2_SumSubArrays(arr);

        // *Kadan's Algorithm: O(n)
        M3_SumSubArrays(arr);
    }
}
