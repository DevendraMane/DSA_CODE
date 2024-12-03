package Arrays;

//? Q. Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

//* Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

//* Examples:
// Input: arr = [2, 4, 1, 7, 5, 0]
// Output: [2, 4, 5, 0, 1, 7]
// Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

import java.util.Arrays;

public class next_permutation {

    public static void nextPermutation(int arr[]) {
        int n = arr.length;
        int breakPoint = -1;
        for (int i = n - 2; i >= 0; i--) {
            // Step 1: for finding breakPoint
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(arr, 0, n - 1);
        } else {
            // Step 2: Find the next greater element to swap with
            for (int j = n - 1; j > breakPoint; j--) {
                if (arr[j] > arr[breakPoint]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[breakPoint];
                    arr[breakPoint] = temp;
                    break;
                }
            }

            // Step 3: Reverse the right part after the break-point
            reverse(arr, breakPoint + 1, n - 1);
        }

        System.out.println(Arrays.toString(arr));
    }

    // helper function
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);
    }
}
