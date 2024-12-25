package Recursion;

public class last_occurance {
    public static int forOccr(int arr[], int i, int key) {
        if (i >= arr.length) {
            return -1;
        }
        int isFound = forOccr(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 9, 1, 5 };
        System.out.println(forOccr(arr, 0, 5));
    }
}
