import java.util.*;

public class greter_btn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two no. that you want to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3 + " is greater");
        }
        sc.close();
    }
}
