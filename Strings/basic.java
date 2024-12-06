package Strings;

import java.util.*;

import Basic.pattern2.solid_rhombus;

// ! Strings are IMMUTABLE(you can't change the original string)
public class basic {
    public static String printStr(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i));
        }
        return str;
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

        System.out.println(printStr(str1));

        if (str == str1) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equal");
        }

        // * We use .equals method to check if the value of the two strings is equal or
        // not
        if (str.equals(str1)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equal");
        }

        // *Substring function
        System.out.println("this is the substring: " + coder.substring(0, 8));

        // ? Q.Compare the largest strings.
        // * time complexity : length * no. of strings
        String compareUs[] = { "apple", "mango", "banana" };
        String largest = compareUs[0];
        for (int i = 0; i < compareUs.length; i++) {
            if (largest.compareToIgnoreCase(compareUs[i]) < 0) {
                largest = compareUs[i];
            }
        }
        System.out.println(largest);

        // * StringBuilder: (To prevent the immutabel behavior or Strings)
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // pichese add hona
        }
        System.out.println(sb);
    }

}
