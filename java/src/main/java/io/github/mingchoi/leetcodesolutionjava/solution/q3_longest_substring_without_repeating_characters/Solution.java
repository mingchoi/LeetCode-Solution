package io.github.mingchoi.leetcodesolutionjava.solution.q3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

/*
Runtime: 8 ms, faster than 65.68% of Java online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 36.4 MB, less than 99.76% of Java online submissions for Longest Substring Without Repeating Characters.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) return 0;
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
