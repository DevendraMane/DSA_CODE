import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Print the 2nd number: ");
        int b = sc.nextInt();

        System.out.print("tell the operation to do: ");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            System.out.println(a + b);
        } else if (operation == '-') {
            System.out.println(a - b);

        } else if (operation == '*') {
            System.out.println(a * b);

        } else if (operation == '/') {
            System.out.println(a / b);

        }
        sc.close();
    }
}
