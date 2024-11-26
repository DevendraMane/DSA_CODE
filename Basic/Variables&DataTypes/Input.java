import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        // you can't directly use sc.nextLine(); or it will throw error
        sc.nextLine();
        String Iron_name = sc.nextLine();
        System.out.println(Iron_name + " 5Stark");

        sc.close();
    }
}
