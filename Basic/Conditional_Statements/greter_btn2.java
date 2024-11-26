import java.util.*;

public class greter_btn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two no. that you want to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater");
        } else if (num1 == num2) {
            System.out.println("both are same");
        }
        sc.close();
    }
}