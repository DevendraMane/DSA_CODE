package Strings;

public class string_compression {
    public static char[] compress(char[] ch) {

        // *NEW
        int i = 0;
        int j = 1;
        int count = 1;
        while (j >= i) {
            if (ch[i] == ch[j]) {
                ch[i] = ch[j];
                count++;
                j++;
            } else {
                ch[i + 1] = Integer.to(count);
                i = j;
                count = 1;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        // String str = "aaabbcccdd";
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));
    }
}

// *OLD
// // String newStr = new String("");
// StringBuilder newStr = new StringBuilder("");
// for (int i = 0; i < str.length(); i++) {
// Integer count = 1;
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// count++;
// i++;
// }
// newStr.append(str.charAt(i));
// if (count > 1) {
// newStr.append(count.toString());
// }
// }
// return newStr.toString();
