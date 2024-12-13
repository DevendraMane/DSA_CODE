package Arrays_2D;

import Basic_Sorting_Algorithm.insertion_sort;

public class diagonal_sum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // *below code gives higher T.C(O(n^2))
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // // primary diagonal sum
        // if (i == j) {
        // sum += matrix[i][j];
        // }
        // // secondary diagonal sum
        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // * M2[less T.C(i.e: O(n))]
        for (int i = 0; i < matrix.length - 1; i++) {
            // P.D
            sum += matrix[i][i];
            // S.D(with odd*odd matrix special case consideration)
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int matrix1[][] = { { 1, 2, 3, }, { 5, 6, 7, }, { 9, 10, 11, } };

        // System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSum(matrix1));
    }
}
