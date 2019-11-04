package io.github.mingchoi.leetcodesolutionjava.solution.q326_power_of_three;

/*
Runtime: 11 ms, faster than 80.68% of Java online submissions for Power of Three.
Memory Usage: 35.6 MB, less than 6.25% of Java online submissions for Power of Three.
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n < 3) return false;
        if (n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
}
