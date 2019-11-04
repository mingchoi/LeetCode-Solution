package io.github.mingchoi.leetcodesolutionjava.solution.q3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        int max = 0;
        int first = 0;
        int last = -1;
        while (true) {
            if (map.containsKey(s.charAt(last + 1))) {
                map.remove(s.charAt(first));
                first += 1;
            } else {
                map.put(s.charAt(last + 1), true);
                last += 1;
            }

            if (last - first + 1 > max) {
                max = last - first + 1;
            }

            if (last >= s.length() - 1) {
                break;
            }
        }
        return max;
    }
}
