
package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        String numString = "1231435345412312";
        // String numString = "deva"; ❌will not work

        // System.out.println(Integer.parseInt(numString));

        // ? to convert a string to char arr
        char cArr[] = numString.toCharArray();
        System.out.print(cArr); // why this prints the same number(i.e: 1231435345412312) & not the arr of char

        // ? Reason:
        // Why it prints the string

        // In Java, System.out.print(char[]) is a special case.

        // The print method is overloaded. For char[], it directly prints the array as a
        // String, not like Arrays.toString(...).

        // That’s why you see: 1231435345412312

        // System.out.print(Arrays.toString(cArr));
    }
}