package Strings;

public class find_vowels {
    public static int find(String str) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Devendra Mane";
        System.out.println(find(str));
    }
}
