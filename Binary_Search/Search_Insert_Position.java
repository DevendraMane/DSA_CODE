package Binary_Search;

public class Search_Insert_Position {
    public static int position(int[] arr, int target) {
        int lo = 0;
        int n = arr.length;
        int hi = n - 1;

        // if (lo == hi && arr[lo] > target) {
        // return lo;
        // } else if (lo == hi && arr[lo] < target) {
        // return lo + 1;
        // }

        // if ((n == 2 && target > arr[lo] && target < arr[hi])) {
        // return lo + 1;
        // } else if (n == 2 && target > arr[hi]) {
        // return hi + 1;
        // } else if (n == 2 && n < 3 && target < arr[lo]) {
        // return lo;
        // }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo; // 😬
        // if (lo < n - 1 && arr[lo] < target) {
        // return lo + 1;
        // } else if (lo <= n - 1 && arr[lo] > target || lo > n - 1) {
        // return lo;
        // } else {
        // return lo - 1;
        // }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        System.out.println(position(arr, 4));
    }
}
