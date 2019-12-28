package io.github.mingchoi.leetcodesolutionjava.solution.q852_peak_index_in_a_mountain_array;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Peak Index in a Mountain Array.
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1])
                return i;
        }
        return -1;
    }
}