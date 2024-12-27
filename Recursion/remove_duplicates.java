package Recursion;

public class remove_duplicates {
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        // base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currCh = str.charAt(index);
        if (map[currCh - 'a'] == true) {
            // duplicate
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            map[currCh - 'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currCh), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
