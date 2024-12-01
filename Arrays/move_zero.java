package Arrays;

import java.util.Arrays;

public class move_zero {
    public static void zeroToRight(int arr[]) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                arr[temp] = arr[i];
                temp++;
            }
        }
        while (temp < arr.length) {
            arr[temp] = 0;
            temp++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        zeroToRight(arr);
    }
}
