package Binary_Search;

public class floor_in_sortedArray {

    // *😅 Answer on my own
    // public static int floor(int arr[], int x) {

    // int n = arr.length;
    // int lo = 0;
    // int hi = n - 1;
    // if (n - 1 == 0)
    // return 0;
    // if (n == 2) {
    // if (arr[0] <= x && arr[1] == n - 1) {
    // return 0;
    // } else if (arr[n - 1] <= x && arr[n - 1] > arr[n - 2]) {
    // return n - 1;
    // }

    // if (arr[0] <= x && arr[0] > arr[1]) {
    // return 0;
    // }
    // }

    // if (arr[n - 1] <= x && arr[n - 1] > arr[n - 2]) {
    // return n - 1;
    // }

    // while (lo <= hi) {
    // int mid = (hi + lo) / 2;
    // if (arr[mid] > x) {
    // hi = mid - 1;
    // } else if (mid != 0 && arr[mid] <= x && arr[mid] >= arr[mid - 1] && arr[mid]
    // > arr[mid + 1]) {
    // return mid;
    // } else if (mid != n - 1 && arr[mid] <= x && arr[mid + 1] <= x) {
    // lo = mid + 1;
    // } else {
    // return mid;
    // }

    // }
    // return -1;
    // }

    public static int floor(int arr[], int x) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int index = -1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;

            if (arr[mid] > x) {
                hi = mid - 1;
            } else if (arr[mid] <= x) {
                index = mid;
                lo = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 10, 10, 12, 19 };
        System.out.println(floor(arr, 5));
    }
}