package Questions;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want table of:");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(table);
        }
    }
}
