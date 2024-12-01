package Arrays;

public class second_largest {
    public static void secondLargest(int arr[]) {
        int mx = Integer.MIN_VALUE;
        int sec_mx = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > mx) {
                sec_mx = mx;
                mx = arr[i];
            } else if (arr[i] < mx && arr[i] > sec_mx) {
                sec_mx = arr[i];
            }
        }
        System.out.println(sec_mx);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, -2, 5, 3 };
        // System.out.println();
        secondLargest(arr);

    }
}
