package io.github.mingchoi.leetcodesolutionjava.solution.q821_shortest_distance_to_a_character;

import java.util.Arrays;

/*
Runtime: 1 ms, faster than 99.14% of Java online submissions for Shortest Distance to a Character.
Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Shortest Distance to a Character.
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] r = new int[S.length()];
        Arrays.fill(r, Integer.MAX_VALUE - 1);
        if (S.charAt(0) == C) r[0] = 0;
        if (S.charAt(S.length() - 1) == C) r[S.length() - 1] = 0;
        for (int i = S.length() - 2; i >= 0; i--) {
            if (S.charAt(i) == C) {
                r[i] = 0;
            } else {
                r[i] = Math.min(r[i], r[i + 1] + 1);
            }
        }
        for (int i = 1; i < S.length(); i++) {
            r[i] = Math.min(r[i], r[i - 1] + 1);
        }
        return r;
    }
}