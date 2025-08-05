package Basic.Loops;

import java.util.*;

public class break_stmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.print("enter the number ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);

        }
        System.out.println("You have entered multiple of 10");
        sc.close();

    }
}
