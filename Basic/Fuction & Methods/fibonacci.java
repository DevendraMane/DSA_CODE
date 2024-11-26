import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n up to which you want the fibonacci series: ");
        int t = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.print(first + " ," + second);

        for (int i = 2; i <= t; i++) {
            int next = first + second;
            System.out.print(" ," + next);
            first = second;
            second = next;
        }
        sc.close();
    }
}
// see the break point for the working