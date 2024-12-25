package Recursion;

public class x_pow_n {
    public static int pow(int x, int n) {
        // base case
        if (n == 1) {
            return x;
        }

        // int pnm1 = pow(x, n - 1);
        // int pxn = x * pnm1;
        // return pxn;

        // or
        return x * pow(x, n - 1);

    }

    public static int powOpti(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // int halfPowSqr = powOpti(x, n / 2) * powOpti(x, n / 2); //by doing this the
        // T.C remains the same(i.e: O(n))

        // *do this instead:
        int halfPow = powOpti(x, n / 2);
        int halfPowSqr = halfPow * halfPow;

        // n is odd
        if (n % 2 != 0) {
            halfPowSqr = x * halfPowSqr;
        }

        return halfPowSqr;
    }

    public static void main(String[] args) {
        // System.out.println(pow(2, 10));
        System.out.println(powOpti(2, 10));
    }
}
