package Arrays;

import java.util.*;

public class Union_Two_Arrays {
    public static void doUnion(int arr1[], int arr2[]) {
        // * Method 1(by using set)
        // TreeSet<Integer> set1 = new TreeSet<>();
        // for (int i = 0; i < arr1.length; i++) {
        // set1.add(arr1[i]);
        // }
        // for (int i = 0; i < arr2.length; i++) {
        // set1.add(arr2[i]);
        // }

        // System.out.println(set1);

        // *by using two pointer approach
        int i = 0, j = 0;

        ArrayList<Integer> al = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                al.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                al.add(arr1[i]);
                i++;
            } else {
                al.add(arr2[j]);
                j++;
            }
        }
        System.out.println(al);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 5, 6, 9 };
        doUnion(arr1, arr2);

    }
}
