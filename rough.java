import java.util.*;
import java.util.Arrays;

public class rough {
    public static int hIndex(int[] arr1, int[] arr2, int k) {
        // code here
        int m = arr1.length, n = arr2.length;
        int[] arr3 = new int[m + n];

        System.arraycopy(arr1, 0, arr3, 0, m);
        System.arraycopy(arr2, 0, arr3, m, n);

        Arrays.sort(arr3);

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int k = 5;
        System.out.println(hIndex(arr1, arr2, k));
    }
}
