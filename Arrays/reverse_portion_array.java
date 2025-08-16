package Arrays;

import java.util.Arrays;

public class reverse_portion_array {
    static void reverse_portion(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        reverse_portion(arr, 2, 4); // index 2 to 4 reverse karega
        System.out.println(Arrays.toString(arr));
    }
}