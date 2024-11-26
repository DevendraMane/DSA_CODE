import java.util.*;

public class unary {

    public static void main(String[] args) {
        // Increment operator
        // pre
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);
        // post
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        // (Same for decrement operator)
    }
}