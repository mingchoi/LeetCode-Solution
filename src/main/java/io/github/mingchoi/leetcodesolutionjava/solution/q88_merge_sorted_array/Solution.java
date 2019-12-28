package io.github.mingchoi.leetcodesolutionjava.solution.q88_merge_sorted_array;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int ptr = m + n - 1;
        while (ptr > 0) {
            if (p1 < 0) {
                nums1[ptr] = nums2[p2];
                p2--;
                ptr--;
            } else if (p2 < 0) {
                nums1[ptr] = nums1[p1];
                p1--;
                ptr--;
            } else if (nums1[p1] < nums2[p2]) {
                nums1[ptr] = nums2[p2];
                p2--;
                ptr--;
            } else {
                nums1[ptr] = nums1[p1];
                p1--;
                ptr--;
            }
        }
        if (p2 == 0) {
            nums1[0] = nums2[0];
        }
    }
}
