package Bit_Manupulation;

public class countSetBits {
    public static int count(int n) {
        int freq = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                freq++;
            }
            n = n >> 1;
        }
        return freq;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(count(n));
    }
}
