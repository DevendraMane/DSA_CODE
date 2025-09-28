package Strings;
// ?Q.Given an integer s represented as a string, the task is to get the sum of all possible sub-strings of this string.

// Note: The number may have leading zeros.
// It is guaranteed that the total sum will fit within a 32-bit signed integer.

// Examples:

// Input: s = "6759"
// Output: 8421
// Explanation:
// Sum = 6 + 7 + 5 + 9 + 67 + 75 + 59 + 675 + 759 + 6759 = 8421

public class sum_of_all_substring {
    public static int Innersum_of_all_substring(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                sum += Integer.parseInt(s.substring(i, j));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "9881";
        System.out.println(Innersum_of_all_substring(str));
        // Innersum_of_all_substring(str);

    }
}
