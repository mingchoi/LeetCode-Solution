package io.github.mingchoi.leetcodesolutionjava.solution.q76_minimum_window_substring;

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    return "";
                }
            }
            return t;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), 0);
        }

        int start = 0;
        int end = -1;
        int shortest = Integer.MAX_VALUE;
        String shortStr = "";
        while (true) {
            if (start == 0 && end == s.length() - 1) {
                return "";
            }

            // check shortest window
            boolean containAll = true;
            for (Character key : map.keySet()) {
                if (map.get(key) < 1) {
                    containAll = false;
                }
            }
            if (containAll == true && end - start + 1 < shortest) {
                shortest = end - start + 1;
                shortStr = s.substring(start, end + 1);
            }

            // pop
            Character cs = s.charAt(start);
            if (map.containsKey(cs)) {
                if (map.get(cs) > 1) {
                    start++;
                    map.put(cs, map.get(cs) - 1);
                    continue;
                } else if (end == s.length() - 1) {
                    return shortStr;
                }
            } else {
                start++;
                continue;
            }

            // push
            if (end < s.length() - 1) {
                Character cn = s.charAt(end + 1);
                if (map.containsKey(cn)) {
                    map.put(cn, map.get(cn) + 1);
                }
                end++;
            }
        }
    }
}
