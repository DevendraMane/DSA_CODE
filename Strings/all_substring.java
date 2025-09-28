package Strings;

public class all_substring {
    public static void main(String[] args) {
        String str = "deva";
        // int ptr = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
                ;
            }
            System.out.println();

        }
    }
}
