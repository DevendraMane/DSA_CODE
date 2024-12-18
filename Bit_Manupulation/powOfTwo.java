package Bit_Manupulation;

import Strings.string_compression;

public class powOfTwo {
    public static boolean powOfTwoOrNot(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(powOfTwoOrNot(n));
    }
}
