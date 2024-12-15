package Strings;

import java.util.Arrays;

public class first_nonReapeating {
    public static char nonRepeatingChar1(String s) {
        char[] sCh = s.toCharArray();
        Arrays.sort(sCh);

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            for (char ch : sCh) {
                if (ch == currentChar) {
                    count++;
                }
            }

            if (count == 1) {
                return currentChar;
            }
        }

        return '$';
    }

    // * Method-2 (using abcd/"Index Mapping"/"Character Mapping")
    public static char nonRepeatingChar2(String s) {
        char[] sCh = s.toCharArray();

        int[] freq = new int[26];
        for (char ch : sCh) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$';

    }

    public static void main(String[] args) {
        String s = "qbc";

        System.out.println(nonRepeatingChar1(s));
        System.out.println(nonRepeatingChar2(s));
        // repeatingChar(s);
    }
}
