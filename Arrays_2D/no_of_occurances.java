package Arrays_2D;

import Strings.string_compression;

public class no_of_occurances {
    public static int noOcurrances(int arr[][], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int num = 8;
        System.out.println(noOcurrances(arr, num));
    }
}
