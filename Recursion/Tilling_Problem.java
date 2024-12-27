package Recursion;

public class Tilling_Problem {
    public static int tillngProblem(int n) { // 2 * n(length)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // veritcal
        int fnm1 = tillngProblem(n - 1);
        // horizontal
        int fnm2 = tillngProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tillngProblem(4));
    }
}
