package Strings;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        double n = sc.nextDouble(); // try to take input as 000.0123

        // *M1
        // int count = 0;
        // while (n != 0) {
        // n /= 10;
        // count++;
        // }
        // System.out.println(count);

        // *M2
        String s = "" + n;
        System.out.println(s.length());
    }
}
