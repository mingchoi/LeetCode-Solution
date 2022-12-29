package io.github.mingchoi.leetcodesolutionjava.solution.q371_sum_of_two_integers;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
Memory Usage: 32.8 MB, less than 6.67% of Java online submissions for Sum of Two Integers.
 */
public class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
