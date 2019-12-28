package io.github.mingchoi.leetcodesolutionjava.solution.q454_4sum_ii;

import java.util.HashMap;

/*
Runtime: 90 ms, faster than 43.70% of Java online submissions for 4Sum II.
Memory Usage: 64 MB, less than 12.00% of Java online submissions for 4Sum II.
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        int[] list = new int[len * len];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                list[i * len + j] = A[i] + B[j];
                int cd = C[i] + D[j];
                map.put(cd, map.getOrDefault(cd, 0) + 1);
            }
        }
        int count = 0;
        for (int n : list) {
            if (map.containsKey(-1 * n)) count += map.get(-1 * n);
        }
        return count;
    }
}