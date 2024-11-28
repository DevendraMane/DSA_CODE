package Basic_Sorting_Algorithm;

public class bubble_sort {
    public static void sort(int arr[]) {

        // * loop for counting the turns
        for (int turn = 0; turn <= arr.length - 2; turn++) {
            // * loop for getting the final index of the swapping element
            for (int j = 0; j <= arr.length - 2 - turn; j++) {
                // ? big bubble should go to the further index
                if (arr[j] > arr[j + 1]) {
                    // ? swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int sorted_arr[] = { 1, 2, 3, 4, 5 };
        sort(arr); // O(n²)
        printArr(arr);
        sort(sorted_arr); // todo: O(n²) (why this is same istead it should be done in less time)
        printArr(sorted_arr);
    }
}
