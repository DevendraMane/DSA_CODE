package Recursion;

// ?Think how you can do this using Math's like the stairs question
// for reference see the image: unique_path.png
public class unique_path {
    // public static int uniquePaths(int m, int n) {
    // if (n == 1 || m == 1) {
    // return 1;
    // }
    // return uniquePaths(m, n - 1) + uniquePaths(m - 1, n);
    // }

    public static int uniquePaths(int cr, int cc, int lr, int lc) {
        if (cr == lr && cc == lc) {
            return 1;
        }
        if (cr > lr || cc > lc) {
            return 0;
        }
        int right = uniquePaths(cr, cc + 1, lr, lc);
        int down = uniquePaths(cr + 1, cc, lr, lc);
        return right + down;
    }

    public static void main(String[] args) {
        // System.out.print(uniquePaths(7, 3));
        System.out.print(uniquePaths(0, 0, 7, 3));
    }
}
