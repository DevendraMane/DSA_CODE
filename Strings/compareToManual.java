package Strings;

public class compareToManual {
    public static String compareTo(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 > c2) {
                return "first is larger";
            } else if (c1 < c2) {
                return "second is larger";
            }
        }

        if (s1.length() == s2.length()) {
            return "equal";
        } else if (s1.length() > s2.length()) {
            return "first is larger";
        } else {
            return "second is larger";
        }
    }

    public static void main(String[] args) {
        String name = "devendra";
        String realName = "zepto";
        System.out.println(compareTo(name, realName));
    }
}
