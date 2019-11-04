package io.github.mingchoi.leetcodesolutionjava.solution.q29_divide_two_integers;

class Solution {
    public int divide(int dividend, int divisor) {
        int count = 0;
        int sum = 0;
        boolean nev = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (true) {
            if (sum == dividend) {
                break;
            } else if (sum > dividend) {
                count--;
                break;
            }
            count++;
            sum += divisor;
        }

        if (nev) {
            return count * -1;
        }

        return count;
    }
}
