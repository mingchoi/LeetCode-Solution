package io.github.mingchoi.leetcodesolutionjava.solution.q69_sqrtx;

class Solution {
    public int mySqrt(int x) {
        long min = 0;
        long max = x / 2 + 1;
        while (min <= max) {
            long mid = (min + max) / 2;
            long r = mid * mid;
            if (r == x) {
                return (int) mid;
            } else if (r > x) {
                max = mid - 1;
            } else if (r < x) {
                min = mid + 1;
            }
        }
        return (int) max;
    }
}
