package io.github.mingchoi.leetcodesolutionjava.solution.q387_first_unique_character_in_a_string;

import java.util.HashMap;

/*
Runtime: 18 ms, faster than 60.56% of Java online submissions for First Unique Character in a String.
Memory Usage: 38.4 MB, less than 96.43% of Java online submissions for First Unique Character in a String.
 */
public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> once = new HashMap<>();
        HashMap<Character, Boolean> more = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (more.get(c) != null) {
                continue;
            } else if (once.get(c) != null) {
                once.remove(c);
                more.put(c, true);
            } else {
                once.put(c, i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Character c : once.keySet()) {
            if (min > once.get(c))
                min = once.get(c);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}