package Strings;

import java.util.Arrays;

public class reverse_words {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("this is devendra"));
        ;
    }
}
