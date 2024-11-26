import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int num = sc.nextInt();

        if (num < 500000) {
            System.out.println("Your tax will be zero");
        } else if (num > 500000 && num <= 1000000) {
            double tax = num * 0.20; // 20% tax
            System.out.println("Your tax will be " + tax);
        } else if (num > 1000000) {
            double tax = num * 0.30; // 30% tax
            System.out.println("Your tax will be " + tax);
        }
        sc.close();
    }
}
