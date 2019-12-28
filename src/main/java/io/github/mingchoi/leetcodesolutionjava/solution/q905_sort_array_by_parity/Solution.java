package io.github.mingchoi.leetcodesolutionjava.solution.q905_sort_array_by_parity;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.9 MB, less than 95.14% of Java online submissions for Sort Array By Parity.
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] r = new int[A.length];
        int odd = A.length - 1;
        int even = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1)
                r[odd--] = A[i];
            else
                r[even++] = A[i];
        }
        return r;
    }
}