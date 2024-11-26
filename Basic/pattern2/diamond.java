package Basic.pattern2;

public class diamond {
    public static int diamondFn(int n) {
        for (int i = 1; i <= n; i++) {
            // space - (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars - count
            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(" *");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // space - (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars - count
            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(" *");
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        diamondFn(5);
    }
}
