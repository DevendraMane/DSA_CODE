package Recursion;

public class first_occurance {
    public static int forOccr(int arr[], int i, int key) {
        // base case
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        } else {
            return forOccr(arr, i + 1, key);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 9, 1, 5 };
        System.out.println(forOccr(arr, 0, 5));
    }
}
