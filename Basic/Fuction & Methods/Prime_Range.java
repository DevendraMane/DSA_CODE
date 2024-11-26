import java.math.*;

public class Prime_Range {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }

    }
}