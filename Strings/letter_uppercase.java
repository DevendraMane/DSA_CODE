package Strings;

public class letter_uppercase {
    public static String toUpperCase(String str) {
        // for storing the updated str
        StringBuilder updStr = new StringBuilder("");

        // make the 1st letter capital
        char ch = Character.toUpperCase(str.charAt(0));
        updStr.append(ch);

        // to make the 1st letter uppercase
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                updStr.append(str.charAt(i));
                i++;
                updStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                updStr.append(str.charAt(i));
            }
        }
        return updStr.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am deva";
        System.out.println(toUpperCase(str));
    }
}
