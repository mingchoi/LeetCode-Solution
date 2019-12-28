package io.github.mingchoi.leetcodesolutionjava.solution.q4_median_of_two_sorted_arrays;

/*
Runtime: 2 ms, faster than 99.97% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 46.6 MB, less than 90.97% of Java online submissions for Median of Two Sorted Arrays.
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int a = 0;
        int i = 0;
        int j = 0;
        while (i + j < arr.length) {
            if (i >= nums1.length) {
                arr[a] = nums2[j];
                j++;
            } else if (j >= nums2.length) {
                arr[a] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                arr[a] = nums2[j];
                j++;
            } else {
                arr[a] = nums1[i];
                i++;
            }
            a++;
        }
        if (arr.length % 2 == 0) {
            int p = arr.length / 2;
            return (arr[p] + arr[p - 1]) / 2.0;
        }
        return arr[arr.length / 2];
    }
}
