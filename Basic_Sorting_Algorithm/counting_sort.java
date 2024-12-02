package Basic_Sorting_Algorithm;

import java.nio.channels.Pipe.SourceChannel;

import java.util.Arrays;

public class counting_sort {
    public static void sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest + 1];
        for (int i = 0; i <= arr.length - 1; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length - 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        sort(arr);
    }
}
