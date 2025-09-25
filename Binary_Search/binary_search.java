package Binary_Search;

public class binary_search {
    // * by simple method:
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

    // *Recursive Method:
    // public static int binarySearch(int nums[], int low, int high, int key) {
    // // BASE CASE
    // if (low > high) {
    // return -1;
    // }

    // int mid = low + (high - low) / 2; // safer mid calculation

    // if (nums[mid] == key) {
    // return mid;
    // } else if (key > nums[mid]) {
    // return binarySearch(nums, mid + 1, high, key);
    // } else {
    // return binarySearch(nums, low, mid - 1, key);
    // }
    // }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 42, 41, 54, 64, 21 };

        // int result = binarySearch(nums, 0, nums.length - 1, 2);

        // System.out.println(result);
    }
}
