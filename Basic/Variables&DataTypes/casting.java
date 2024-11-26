import java.lang.*;
import java.util.Scanner;

public class casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for float suffix f/F is imp
        float a = 25.12f;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int c = ch;
        System.out.println(c + " is value of a");

    }
}

// Also know as norrowing or explicite conversion...
