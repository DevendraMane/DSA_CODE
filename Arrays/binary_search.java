package Arrays;

public class binary_search {
    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            // step - 1
            int mid = (start + end) / 2;

            // step -2 (comparison)
            if (nums[mid] == key) {
                return mid;
            }
            // step - 3 (direction)
            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 42, 41, 54, 64, 21 };

        System.out.println(binarySearch(nums, 2));
    }
}
