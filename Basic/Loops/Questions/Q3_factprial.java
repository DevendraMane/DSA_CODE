package Questions;

import java.util.*;

public class Q3_factprial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of: ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
