package Binary_Search;

public class square_root {

    // *by using simple method:
    // public static int find_square_root(int n) {
    // int root = 0;
    // // ?🤔 the root will always be in-between 1 to n
    // // todo: time-complexity is O(√n) - think why??
    // for (int i = 0; i <= n; i++) {
    // if (i * i > n)
    // break;
    // root = i;
    // }
    // return root;
    // }

    public static int find_square_root(int n) {
        // 🤔
        // int lo = 1;
        // int hi = n;

        // int ans = 0;

        // while (lo <= hi) {
        // int mid = (lo + hi) / 2;

        // if (mid * mid > n) {
        // hi = mid - 1;
        // } else if (mid * mid < 20) {
        // ans = mid;
        // lo = mid + 1;
        // }
        // }
        // return ans;

        // 🤔
        // long lo = 1;
        // long hi = n;
        // long ans = 0;

        // if (n == 0)
        // return 0;
        // while (lo <= hi) {
        // long mid = (hi + lo) / 2;
        // if (mid * mid == n)
        // return (int) mid;
        // if (mid * mid > n)
        // hi = mid - 1;
        // else if (mid * mid < n) {
        // ans = mid;
        // lo = mid + 1;
        // }
        // }
        // return (int) ans;

        // ✅
        int lo = 1;
        int hi = n;
        int ans = 0;

        if (n == 0)
            return 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == n / mid) // ? n*n = m => n = m/n
                return mid;
            if (mid > n / mid)
                hi = mid - 1;
            else if (mid < n / mid) {
                ans = mid;
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(find_square_root(n));
        ;
    }
}
