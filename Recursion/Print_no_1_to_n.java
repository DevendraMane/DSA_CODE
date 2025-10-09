package Recursion;

import java.util.Scanner;

public class Print_no_1_to_n {
    static int x;

    // *Method-1
    // public static void print(int x, int n) {
    // if (n > x)
    // return;
    // System.out.print(n + " ");
    // print(n + 1);
    // }
    // *Method-2
    // public static void print(int n) {
    // if (n > x)
    // return;
    // System.out.print(n + " ");
    // print(n + 1);
    // }
    // *Method-3
    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        print(1);
    }
}
