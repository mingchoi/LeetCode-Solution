package io.github.mingchoi.leetcodesolutionjava.solution.q922_sort_array_by_parity_ii;
/*
Runtime: 2 ms, faster than 99.66% of Java online submissions for Sort Array By Parity II.
Memory Usage: 41.6 MB, less than 92.59% of Java online submissions for Sort Array By Parity II.
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        int[] r = new int[A.length];
        for (int n : A) {
            if (n % 2 == 0) {
                r[even] = n;
                even += 2;
            } else {
                r[odd] = n;
                odd += 2;
            }
        }
        return r;
    }
}