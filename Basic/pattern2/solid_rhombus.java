package Basic.pattern2;

public class solid_rhombus {
    public static int solid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        solid(5);
    }
}
