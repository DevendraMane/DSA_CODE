package Basic.pattern2;

public class hollo_rhombus {
    public static int hollo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            // if(i==1 ||i==n || j=+1|| j==n}
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        hollo(5);
    }
}
