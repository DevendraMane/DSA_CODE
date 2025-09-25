package Binary_Search;

public class peak_element {
    // *Simple Method: O(n)
    // public static int peak_elem(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // // ? When i = 0 → the condition i == 0 is true, so arr[i-1] < arr[i] will not
    // be
    // // evaluated (short-circuit in logical OR). ✅ No out of bound.

    // // ? When i = n-1 → the condition i == n-1 is true, so arr[i] > arr[i+1] will
    // // not
    // // be evaluated. ✅ No out of bound.

    // // ? So as long as we’re using short-circuit evaluation (|| and &&), it is
    // safe.
    // if ((i == 0 || arr[i - 1] < arr[i]) &&
    // (i == n - 1 || arr[i] > arr[i + 1]))
    // return i;
    // }
    // return -1;

    // }

    // *Using Binary Search:
    public static int peak_elem(int arr[]) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                hi = mid - 1;
            } else if (arr[mid + 1] >= arr[mid]) {
                lo = mid + 1;
            }
            // *adding this will make it work for any number of peak elem🤔
            else if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 3, 2 };

        System.out.println(peak_elem(arr));
    }
}
