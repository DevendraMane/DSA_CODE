/*Write a Java program to get a number from the user and print whether it is
positive or negative.*/
package Questions;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("Eneter correct number.");
        }
        sc.close();
    }
}
