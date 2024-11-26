/*Write a Java program that takes a year from the user and print whether that
year is a leap year or not */
package Questions;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is leap year.");
        } else {
            System.out.println("It is not leap year.");
        }
        sc.close();
    }
}
