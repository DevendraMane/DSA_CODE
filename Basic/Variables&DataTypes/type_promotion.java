public class type_promotion {
    public static void main(String[] args) {
        // // ex1:
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(b - a);
        // // automatic promotion ↑↑↑↑

        // // ex2:
        // short c = 25;
        // byte d = 5;
        // char e = 'c';
        // byte bt = (byte) (c + d + e);
        // System.out.println(bt);

        // ex3:
        // int a1 = 10;
        // float f = 20.25f;
        // long l = 24;
        // double d1 = 80;
        // double ans = a1 + f + l + d1;
        // System.out.println(ans);

        // case1:
        // byte b1 = 5;
        // b1=b1*2;

        // case2:
        // byte b1 = 5;
        // b1 = (byte) (b1 * 2);
    }

}
// Note:
//
/*
 * 1.Java automatically promotes each type byte, short, or char operand to int
 * when evaluating an expression.
 * 2.If one operand is long, float, or double the whole expression is promoted
 * to long, or double respectively.
 */
