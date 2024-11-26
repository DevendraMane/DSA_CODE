package Arrays;

import java.util.Arrays;

import Basic.pattern2.solid_rhombus;

public class reverse_array {
    public static int reverse_space_complexity_On(int arr[]) {
        int arrC[] = new int[arr.length], j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrC[j] = arr[i];
            j++;
        }
        System.out.print(Arrays.toString(arrC));
        return -1;
    }

    public static int reverse_space_complexity_O1(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // reverse_space_complexity_On(arr);
        reverse_space_complexity_O1(arr);
    }
}
