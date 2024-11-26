import java.util.*;

public class n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth number that you want to print the numbers:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
