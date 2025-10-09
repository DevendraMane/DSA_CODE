package Recursion;

public class reverse_no {

    // *Keeping return type void
    // public static void reverse(int n) {
    // if (n < 10) {
    // System.out.print(n);
    // return;
    // }
    // System.out.print(n % 10);
    // reverse(n / 10);
    // }

    // *Keeping return type int
    public static int reverse(int n, int r) {
        if (n == 0) {
            return r;
        }
        return reverse(n / 10, r * 10 + n % 10);
    }

    public static void main(String[] args) {
        int no = 12345;
        System.out.println(reverse(no, 0));
        ;

        // *by using simple loop
        // int r = 0;
        // while (no != 0) {
        // r = r * 10;
        // r += no % 10;
        // no = no / 10;
        // }

    }
}
