package Recursion;

public class reverse_arr {
    public static void reverse(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        reverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 54, 5 };
        reverse(arr, 0);
    }
}
