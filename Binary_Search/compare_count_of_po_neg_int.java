package Binary_Search;

public class compare_count_of_po_neg_int {
    public static int compare_count(int arr[]) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int lo1 = 0;
        int hi1 = n - 1;
        int positive_count = 0, negative_count = 0;

        // ! ❌Wrong approach
        // while (lo <= hi) {
        // int mid = lo + (hi - lo) / 2;

        // if (arr[mid] == 0) {
        // int p = mid, d = mid;
        // while (p != 0 && arr[p] == arr[p - 1]) {
        // p--;
        // if (p != 0 && arr[p] != arr[p - 1]) {
        // break;
        // }
        // }
        // while (d != n - 1 && arr[d] == arr[d + 1]) {
        // d++;
        // if (d != n - 1 && arr[d] != arr[d - 1]) {
        // break;
        // }
        // }

        // int negative_count = p - 0;
        // int positive_count = (n - 1) - d;

        // return Math.max(negative_count, positive_count);
        // } else {
        // if (mid != n - 1 && arr[mid] < 0 && arr[mid + 1] >= 0) {
        // int negative_count = mid - lo + 1;
        // int positive_count = 0;
        // if (mid != n - 1 && arr[mid + 1] == 0) {
        // int p = mid + 1;
        // int d = mid + 1;
        // while (d != n - 1 && arr[d + 1] == 0) {
        // d++;
        // }
        // positive_count = d - (n - 1);
        // }
        // return Math.max(positive_count, negative_count);
        // } else {
        // lo = mid + 1;
        // }
        // }
        // }
        // return -1;

        // ✅Correct Way:

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
                negative_count = lo;
            }
        }

        // ❌
        // while (lo1 <= hi1) {
        // int mid = lo1 + (hi1 - lo1) / 2;

        // if (arr[mid] <= 0) {
        // lo1 = mid + 1;
        // } else if (mid != 0 && arr[mid - 1] < 0) {
        // lo1 = mid;
        // hi1 = mid - 1;
        // } else {
        // hi1 = mid - 1;
        // positive_count = (n) - lo1;
        // }
        // }

        while (lo1 <= hi1) {
            int mid = lo1 + (hi1 - lo1) / 2;
            if (arr[mid] > 0) {
                hi1 = mid - 1;
            } else {
                lo1 = mid + 1;
            }
        }
        positive_count = n - lo1;
        return Math.max(positive_count, negative_count);
        // return positive_count;

    }

    public static void main(String[] args) {
        int arr[] = { -2, -1, -1, 1, 2, 3 };
        System.out.println(compare_count(arr));
    }
}
