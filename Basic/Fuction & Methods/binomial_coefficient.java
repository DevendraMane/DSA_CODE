public class binomial_coefficient {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int a = 5, b = 3;
        int minus = a - b;
        int n = factorial(a);// n!
        int r = factorial(b); // r!
        int nr = factorial(minus); // (n-r)!
        System.out.println(n / (r * nr));

    }
}
