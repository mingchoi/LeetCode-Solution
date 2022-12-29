package io.github.mingchoi.leetcodesolutionjava.solution.q172_factorial_trailing_zeroes;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.
Memory Usage: 33.5 MB, less than 7.69% of Java online submissions for Factorial Trailing Zeroes.
 */
public class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n != 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }
}
