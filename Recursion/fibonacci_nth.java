package Recursion;

public class fibonacci_nth {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fib_nm1 = fibonacci(n - 1);
        int fib_nm2 = fibonacci(n - 2);
        int fib_n = fib_nm1 + fib_nm2;
        return fib_n;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
