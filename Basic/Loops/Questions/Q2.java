package Questions;

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.println("Enter the numbers:");
            int nums = sc.nextInt();

            if (nums % 2 == 0) {
                evensum = evensum + nums;
            } else {
                oddsum = oddsum + nums;
            }
            System.out.print("You want to continue adding(1-yes/0-no)");
            option = sc.nextInt();
        } while (option == 1);
        System.out.println(evensum);
        System.out.println(oddsum);
        sc.close();
    }
}
