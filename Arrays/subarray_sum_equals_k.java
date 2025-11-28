// Given an array of integers nums and an integer k, return the total number of
// subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2

package Arrays;

public class subarray_sum_equals_k {

}

// class Solution {
// public int subarraySum(int[] arr, int k) {
// int n = arr.length;
// int i = 0, j = 1;
// int count = 0;

// while(j < n){

// if(arr[i] == k){
// count++;
// }

// if(j != n){
// int sum = arr[i] + arr[j];
// if(sum == k){
// count++;
// j++;
// }
// }
// }

// return count;
// }
// }