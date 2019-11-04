package io.github.mingchoi.leetcodesolutionjava.solution.q202_happy_number;

import java.util.HashMap;

/*
Runtime: 2 ms, faster than 63.75% of Java online submissions for Happy Number.
Memory Usage: 33.7 MB, less than 10.60% of Java online submissions for Happy Number.
 */
public class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        while (true) {
            if (n == 1) return true;
            if (map.get(n) != null) return false;
            map.put(n, true);

            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
        }
    }
}
