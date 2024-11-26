package Basic.pattern2;

public class palindromic_pyramid {
    public static int palindromic_nums_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        palindromic_nums_pyramid(5);
    }
}
