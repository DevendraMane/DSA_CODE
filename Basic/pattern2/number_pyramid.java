package Basic.pattern2;

public class number_pyramid {
    public static int nums_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // nums
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        nums_pyramid(5);
    }
}
