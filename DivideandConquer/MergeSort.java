package DivideandConquer;

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // ? left(0,3)=4 right(4, 6)=3 --> 6-0+1
        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        // ? meaning of the below loop is it will go from si-->mid(for left) &&
        // mid+1-->ei(for right)
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                // k++;
            } else {
                temp[k] = arr[j];
                j++;
                // k++;
            }
            k++; // ? k++ was happening both the time so we have written it here
        }

        // remaing left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    // ? Example if you are not understanding why we have written seperate code for
    // remaning part
    // * Maan lo arr = {6, 3, 9, 5, 2, 8} hai aur humne left {3, 6, 9} aur right {2,
    // * 5, 8} ko merge karna hai.
    // * while (i <= mid && j <= ei) ke baad temp = {2, 3, 5, 6} ho chuka hai, par
    // * abhi 9 (left part ka) aur 8 (right part ka) baaki hain.
    // * while (i <= mid) left ke baaki 9 ko copy karega.
    // * while (j <= ei) right ke baaki 8 ko copy karega.
    // * Final temp = {2, 3, 5, 6, 8, 9} banega.

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2; // or we can use (si+ei)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei); // merging the left and right part in a temp arr
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, (arr.length - 1));
        printArr(arr);
    }
}
