package Arrays;

public class linear_search {
    public static int linear_search(int num[], int key) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 32, 54, 12, 3 };
        int require_num = 12;
        int index = linear_search(nums, require_num);
        System.out.println(index);

    }
}
