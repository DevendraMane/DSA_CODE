package Strings;

import java.util.Arrays;

public class most_freq {
    public static char most_frequent(String str) {
        // *Method1: BrutForce
        // int max_count = Integer.MIN_VALUE;
        // char max_char = '\0'; // empty char
        // for (int i = 0; i < str.length(); i++) {
        // int count = 0;
        // char ch = str.charAt(i);
        // for (int j = i; j < str.length(); j++) {
        // if (str.charAt(j) == ch) {
        // count++;
        // }

        // }
        // if (count > max_count) {
        // max_count = count;
        // max_char = ch;
        // } else if (count == max_count && ch < max_char) {
        // max_char = ch;
        // }
        // }
        // return max_char;

        // *Method2: using sliding window algo
        // char ch[] = str.toCharArray();
        // int n = ch.length;
        // int max_freq = Integer.MIN_VALUE;
        // char ans = str.charAt(0);
        // Arrays.sort(ch);
        // int i = 0, j = 0;

        // while (j < n) {
        // if (ch[i] == ch[j]) {
        // j++;
        // } else {
        // int freq = j - i; // understand why🤔
        // if (max_freq < freq) {
        // max_freq = freq;
        // ans = ch[i];
        // }
        // i = j;
        // }
        // }
        // // understand why again here🤔
        // int freq = j - i;
        // if (max_freq < freq) {
        // max_freq = freq;
        // ans = ch[i];
        // }
        // return ans;

        // *Method-3(By using freq array)
        int freq[] = new int[26];
        int max_freq = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        char ans = str.charAt(0);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max_freq) {
                max_freq = freq[i];
                ans = (char) (i + 97);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(most_frequent(s));
    }
}
