package Recursion;

public class Friends_Paring {
    public static int friendsParing(int n) {

        // Base Case:
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int fnm1 = friendsParing(n - 1);

        // pair
        int fnm2 = friendsParing(n - 2);
        int pairWays = (n - 1) * fnm2;

        return fnm1 + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsParing(5));
    }
}
