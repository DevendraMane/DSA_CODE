package Recursion;

public class Sum_of_1st_n_natural_no {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sm = n + snm1;
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
