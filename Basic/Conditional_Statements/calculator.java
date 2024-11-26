import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no. :");
        float num1 = sc.nextInt();
        System.out.print("Enter the 2nd no. :");
        float num2 = sc.nextInt();
        System.out.print("Enter the Operation that you want to do :");
        char Operation = sc.next().charAt(0);

        switch (Operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Enter correct numbers");
                break;
        }
        sc.close();
    }
}
