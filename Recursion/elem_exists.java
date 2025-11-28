package Recursion;

public class elem_exists {
    public static boolean exists(int arr[], int elem, int idx) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == elem) {
            return true;
        }

        return exists(arr, elem, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 54, 5 };
        int elem = 53;
        System.out.println(exists(arr, elem, 0));
        ;
    }
}
