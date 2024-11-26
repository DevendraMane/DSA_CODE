import java.math.*;

public class binary_decimal {
    public static int DtoB(int n) {
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }

        return bin;
    }

    public static void main(String[] args) {
        System.out.println(DtoB(111));
    }
}
