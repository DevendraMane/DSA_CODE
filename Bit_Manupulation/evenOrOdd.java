package Bit_Manupulation;

import Strings.string_compression;

public class evenOrOdd {
    public static void oddOrEven(int n) {
        int bitMast = 1;
        if ((n & 1) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        oddOrEven(n);
    }
}
