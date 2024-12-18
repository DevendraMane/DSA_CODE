package Strings;

public class Strings_Rotations_of_Each_Other {
    public static boolean Rotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);

    }

    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        System.out.println(Rotation(s1, s2));
    }

    // todo: solve this using KMP algo(for less T.C)
}
