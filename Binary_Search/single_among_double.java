package Binary_Search;

public class single_among_double {

    public static int get_out_single(int arr[]) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;

        if (arr.length == 1)
            return arr[0];

        if (n > 1) {
            if (arr[0] != arr[1]) {

                return arr[0];
            } else if (arr[n - 1] != arr[n - 2]) {
                return arr[n - 1];
            }
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] == arr[mid - 1]) {
                int p = mid - 1;
                int d = mid;
                if (p == 0) {
                    if (arr[d + 1] != arr[d] && arr[d + 1] != arr[d + 2]) {
                        return arr[d + 1];
                    }
                }
                int dist = ((p - 1) - lo + 1);
                if (dist / 2 != 0) {
                    lo = d + 1;
                } else {
                    hi = p - 1;
                }
            } else if (arr[mid] == arr[mid + 1]) {
                int p = mid;
                int d = mid + 1;

                int dist = ((p - 1) - lo + 1);
                if (dist / 2 != 0) {

                    hi = p - 1;
                } else {
                    lo = d + 1;
                }
            }
        }
        return -1;

    }

    public static int get_out_single1(int arr[]) {
        int n = arr.length;
        int lo = 0, hi = n - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // ensure mid is even
            if (mid % 2 == 1)
                mid--;

            if (arr[mid] == arr[mid + 1]) {
                lo = mid + 2; // move right
            } else {
                hi = mid; // move left (or mid is answer)
            }
        }
        return arr[lo];
    }

    public static int get_out_single_raghav_sir(int arr[]) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
            int p = mid, d = mid;
            if (arr[mid - 1] == arr[mid])
                p = mid - 1;
            else
                p = mid + 1;
            int leftCount = p - lo;
            // int rightCount = hi - d;
            if (leftCount % 2 == 0)
                lo = d + 1;
            else
                hi = p - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
        int arr1[] = { 1, 1, 2, 3, 3, 7, 7, };
        // System.out.println(get_out_single(arr1));
        System.out.println(get_out_single1(arr));
    }
}
