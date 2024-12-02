package Arrays;
// ? Q.Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

import java.util.Arrays;

public class rotate_array_counterclockwise {
    public static void rotateArr(int arr[], int dSteps) {
        dSteps = dSteps % arr.length;

        reverse(arr, 0, dSteps - 1);

        reverse(arr, dSteps, arr.length - 1);

        reverse(arr, 0, arr.length - 1);

        System.out.print(Arrays.toString(arr));
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
        int arr[] = { 1, 2, 3, 4, 5 };
        int dSteps = 2;
        rotateArr(arr, dSteps);
    }
}
