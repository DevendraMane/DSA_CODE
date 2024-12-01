package Basic_Sorting_Algorithm;

import java.util.Arrays;

public class insertion_sort {

    public static void sort(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // for finding the correct position to insert...
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
    }
}
