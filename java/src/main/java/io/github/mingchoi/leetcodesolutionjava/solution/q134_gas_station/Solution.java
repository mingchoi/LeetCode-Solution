package io.github.mingchoi.leetcodesolutionjava.solution.q134_gas_station;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Gas Station.
Memory Usage: 37.8 MB, less than 50.98% of Java online submissions for Gas Station.
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = 0;
        int c = 0;
        int s = 0;

        for (int i = 0; i < gas.length; i++) {
            c += gas[i] - cost[i];
            if (c < 0) {
                n += c;
                c = 0;
                s = i + 1;
            }
        }

        return c + n >= 0 ? s : -1;
    }
}