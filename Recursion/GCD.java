package Recursion;

import java.util.ArrayList;

public class GCD {
    public static int answer(int a, int b) {
        // ArrayList<Integer> a_cf = new ArrayList<>();
        // ArrayList<Integer> b_cf = new ArrayList<>();
        // int max = Integer.MIN_VALUE;
        // for (int i = 1; i <= a; i++) {
        // if (a % i == 0) {
        // a_cf.add(i);
        // }
        // }
        // for (int i = 1; i <= b; i++) {
        // if (b % i == 0) {
        // b_cf.add(i);
        // }
        // }
        // for (int i : a_cf) {
        // for (int j : b_cf) {
        // if (i == j) {
        // max = Math.max(i, max);
        // }
        // }
        // }
        // System.out.print(a_cf + "\n");

        // System.out.print(b_cf + "\n");
        // return max;

        // *you can do it like this also:
        // int hcf = 1; // 1 is the default commom factor to all
        // for (int i = 2; i <= Math.min(a, b); i++) {
        // if (a % i == 0 && b % i == 0) {
        // hcf = i;
        // }
        // }
        // return hcf;
        // *or(ulta soch)
        // for (int i = Math.min(a, b); i >= 1; i--) {
        // if (a % i == 0 && b % i == 0) {
        // return i;
        // }
        // }
        // return -1;

        // * using recursion(longest sub-division formula)
        // ?this will also work, if a > b bcoz a%b=a if a>b
        // *or you can create a new helper function(Math.min/Math.max)
        // ?T.C is O(log(min(a, b))) think how🤔
        if (a == 0) {
            return b;
        }

        return answer(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(answer(12, 16));
        ;
    }
}
