package Arrays_2D;

import Arrays.reverse_array;

public class search_sorted_matrix {

    public static boolean search(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        int key = 3;
        search(matrix, key);
    }
}