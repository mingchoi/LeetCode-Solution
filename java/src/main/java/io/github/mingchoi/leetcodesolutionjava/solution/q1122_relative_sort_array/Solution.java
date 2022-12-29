package io.github.mingchoi.leetcodesolutionjava.solution.q1122_relative_sort_array;

/**
 * Solution: Counting sort
 */

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Relative Sort Array.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Relative Sort Array.
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] buck = new int[1001];
        int[] r = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            buck[arr1[i]]++;
        }

        int pt = 0;
        for (int n : arr2) {
            while (buck[n]-- != 0) {
                r[pt++] = n;
            }
        }

        for (int n = 0; n < buck.length; n++) {
            while (buck[n]-- > 0) {
                r[pt++] = n;
            }
        }

        return r;
    }
}