package Recursion;

public class a_raise_to_power_b {
    // * Normal(takes O(n) time)
    // public static int answer(int a, int b) {
    // if (b == 1) {
    // return a;
    // }
    // return a * answer(a, b - 1);
    // }

    // *doing it in O(log n) time
    public static int answer(int a, int b) {
        if (b == 1) {
            return a;
        }
        int call = answer(a, b / 2);
        if (b % 2 == 0) {
            return call * call;
        } else
            return a * call * call;
    }

    public static void main(String[] args) {
        System.out.println(answer(5, 3));
        ;
    }
}
