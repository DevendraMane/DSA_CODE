package Arrays_2D;

import Strings.string_compression;
import java.util.Arrays;

public class transpose {
    public static void transposeMatrix(int matrix[][]) {
        int col = matrix[0].length, row = matrix.length;

        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // for-each loop
        for (int[] rowArr : transpose) {
            System.out.println(Arrays.toString(rowArr));
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        transposeMatrix(matrix);
    }
}
