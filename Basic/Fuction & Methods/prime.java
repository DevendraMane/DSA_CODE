import java.math.*;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i;

        if (n <= 1) {
            System.out.println("nor prime nor composite");
        }
        if (n == 2) {
            System.out.println("prime number");
        } else if (n > 0) {
            for (i = 3; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("it is not a prime number.");
                    break;
                }
            }
            if (i == n) {
                System.out.println("prime number");
            }

        } else {
            System.out.println("prime number");
        }

    }
}

// correct version of the code
// import java.util.Scanner;

// public class Prime {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter the number: ");
// int n = sc.nextInt();

// if (n <= 1) {
// System.out.println(n + " is neither prime nor composite.");
// } else if (n == 2) {
// System.out.println("2 is a prime number.");
// } else {
// boolean isPrime = true;
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }
// }
// if (isPrime) {
// System.out.println(n + " is a prime number.");
// } else {
// System.out.println(n + " is not a prime number.");
// }
// }
// sc.close();
// }
// }
