package Arrays;

public class pairs_array {
    public static void pairs(int arr[]) {
        // total_paires = n(n-1)/2
        int total_paires = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int currElem = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.print("(" + currElem + "," + arr[j] + ")");
                total_paires++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs: " + total_paires);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
    }
}
