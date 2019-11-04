package io.github.mingchoi.leetcodesolutionjava.solution.q242_valid_anagram;

import java.util.HashMap;

public class Solution {
    /*
    Runtime: 4 ms, faster than 79.98% of Java online submissions for Valid Anagram.
    Memory Usage: 36.3 MB, less than 98.06% of Java online submissions for Valid Anagram.
     */
    public boolean isAnagram_4ms(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            table[index] += 1;
            int index2 = t.charAt(i) - 'a';
            table[index2] -= 1;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] != 0) return false;
        }
        return true;
    }

    /*
    Runtime: 21 ms, faster than 17.59% of Java online submissions for Valid Anagram.
    Memory Usage: 37 MB, less than 97.42% of Java online submissions for Valid Anagram.
     */
    public boolean isAnagram_slow(String s, String t) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
            } else {
                dict.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (dict.containsKey(c)) {
                int remain = dict.get(c) - 1;
                if (remain == 0) {
                    dict.remove(c);
                } else {
                    dict.put(c, remain);
                }
            } else {
                return false;
            }
        }
        if (dict.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
