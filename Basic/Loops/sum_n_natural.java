import java.util.*;

public class sum_n_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n for which you want the sum of :");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;

        }
        System.out.println(sum);
        sc.close();
    }
}
