package io.github.mingchoi.leetcodesolutionjava.solution.q91_decode_ways;

import java.util.HashMap;

class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        if (s.length() == 2) return checkGroup(s.charAt(0), s.charAt(1));
        HashMap<String, Integer> map = new HashMap<>();
        int[] t = new int[s.length()];
        t[0] = 1;
        t[1] = checkGroup(s.charAt(0), s.charAt(1));
        for (int i = 2; i < s.length(); i++) {
            char last = s.charAt(i - 1);
            char curr = s.charAt(i);
            if (checkGroup(last, curr) == 1) {
                t[i] = t[i - 2];
            } else {
                t[i] = t[i - 2] + t[i - 1];
            }
        }
        return t[s.length() - 1];
    }

    private int checkGroup(int last, int curr) {
        if (last == '1' || last == '2') {
            if (curr >= '0' && curr < '7') {
                return 2;
            }
        }
        return 1;
    }
}
