package io.github.mingchoi.leetcodesolutionjava.solution.q977_squares_of_a_sorted_array;

import java.util.Arrays;
/*
Runtime: 2 ms, faster than 69.25% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.2 MB, less than 99.39% of Java online submissions for Squares of a Sorted Array.
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}