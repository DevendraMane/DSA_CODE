package Strings;

import java.util.*;

// ! Strings are IMMUTABLE(you can't change the original string)
public class basic {
    public static void printStr(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };

        String str = "abcd";

        String str1 = new String("abcd");

        // Input/Output:-

        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();// this accepts anythig that you type
        System.out.println(fullName);

        String coder = "Devendra Mane";
        System.out.println("the length of the string is :" + coder.length());

        printStr(str1);

    }
}
