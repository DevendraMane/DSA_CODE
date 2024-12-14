package Strings;
//? Q.Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.

// Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

// Input: s1 = "1101", s2 = "111"
// Output: 10100
// Example:
//  1101
// + 111
// 10100

public class add_binary_string {

    public static void addBinary(String s1, String s2) {
        int num1 = Integer.parseInt(s1, 2), num2 = Integer.parseInt(s2, 2);
        int sum = num1 + num2;
        System.out.println(Integer.toBinaryString(sum));
    }

    public static void main(String[] args) {
        String s1 = "1101", s2 = "111";

        addBinary(s1, s2);
    }
}
