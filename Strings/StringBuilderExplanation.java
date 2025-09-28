package Strings;

public class StringBuilderExplanation {
    public static StringBuilder rev(StringBuilder str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(j);

            str.setCharAt(i, temp2);
            str.setCharAt(j, temp1);
            i++;
            j--;
        }
        return str;
    }

    public static void main(String[] args) {
        // default capacity is 16
        StringBuilder str = new StringBuilder("deva"); // default(i.e 16) + 1 capacity
        StringBuilder str1 = new StringBuilder(10);
        // str1.append("deva");

        // System.out.println(str1.length());
        // System.out.println(str1.capacity());
        // System.out.println(str.capacity());

        str1.append("12345678911");
        // System.out.println(str1.length());
        // System.out.println(str1.capacity()); // it doubles it
        // System.out.println(str.capacity());

        // ?reverse()
        // System.out.println(rev(str));
        // System.out.println(str.reverse());
        // ;

        // ?delete & insert
        // str.deleteCharAt(1);
        // System.out.println(str); // ? but this is very costly(in terms of time)

        // str.insert(1, 'e');
        // System.out.println(str);

        // ?How to reverse a String
        // String s = "lucky";

        // StringBuilder sb = new StringBuilder(s);
        // StringBuilder rs = sb.reverse();
        // s = rs.toString();
        // System.out.println(s);

    }
}
