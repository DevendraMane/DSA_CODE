package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {
    public static void checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean res = Arrays.equals(str1CharArray, str2CharArray);

            if (res == true) {
                System.out.println("It is an Anagram");
            } else {
                System.out.println("not");
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        checkAnagram(str1, str2);
    }
}
