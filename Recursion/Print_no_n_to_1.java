package Recursion;

public class Print_no_n_to_1 {
    public static void print(int n) {
        // BaseCase
        if (n == 1) {
            System.out.println(n);
            return; // we must write this here to stop the recursion
        }
        // function work
        System.out.println(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
