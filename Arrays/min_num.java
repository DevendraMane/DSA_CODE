package Arrays;

public class min_num {
    public static void minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -1, -2, 1 };
        minimum(arr);
    }
}
