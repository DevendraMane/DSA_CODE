package Recursion;

public class factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1); // no need
        int fn = n * factorial(n - 1);
        return fn;

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
