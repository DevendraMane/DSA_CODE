import java.math.*;

public class decimal_binary {

    public static int BtoD(int n) {
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        return bin;
    }

    public static void main(String[] args) {
        System.out.println(BtoD(7));
        ;
    }
}
