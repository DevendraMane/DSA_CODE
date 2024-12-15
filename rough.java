import java.util.*;
import java.util.Arrays;

public class rough {
    public static char repeatingChar(String s) {
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

    public static void main(String[] args) {
        String s = "qbc";

        System.out.println(repeatingChar(s));
        // repeatingChar(s);
    }
}
