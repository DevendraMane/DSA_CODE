import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  no. that you want to check: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else if (num % 2 != 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println("enter the correct no.");
        }
        sc.close();
    }
}
