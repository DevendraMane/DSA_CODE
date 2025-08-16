package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class remove_duplicates {
    public static void rem_dupli(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size() + "," + set);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 5, 2, 5 };

        rem_dupli(arr);
    }
}
