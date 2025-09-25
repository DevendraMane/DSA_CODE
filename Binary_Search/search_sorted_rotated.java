package Binary_Search;

public class search_sorted_rotated {

    public static int search_index(int arr[], int key) {
        int lo = 0;
        int n = arr.length;
        int hi = n - 1;
        int pivot = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > arr[lo]) {
                pivot = lo;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }
        if (arr[pivot] == key)
            return pivot;

        lo = 0;
        hi = pivot;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > key) {
                hi = mid - 1;
            } else if (arr[mid] < key) {
                lo = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }

        lo = pivot + 1;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > key) {
                hi = mid - 1;
            } else if (arr[mid] < key) {
                lo = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int arr1[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search_index(arr1, 0));
    }
}
