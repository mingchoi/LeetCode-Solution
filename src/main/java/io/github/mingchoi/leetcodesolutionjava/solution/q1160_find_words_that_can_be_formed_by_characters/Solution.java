package io.github.mingchoi.leetcodesolutionjava.solution.q1160_find_words_that_can_be_formed_by_characters;

import java.util.Arrays;

/*
Runtime: 3 ms, faster than 96.79% of Java online submissions for Find Words That Can Be Formed by Characters.
Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Find Words That Can Be Formed by Characters.
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] have = count(chars);
        int sum = 0;
        loop:
        for (String word : words) {
            int[] clone = Arrays.copyOf(have, have.length);
            for (char c : word.toCharArray()) {
                if (--clone[c - 'a'] < 0)
                    continue loop;
            }
            sum += word.length();
        }
        return sum;
    }

    int[] count(String word) {
        int[] map = new int[26];
        for (char c : word.toCharArray()) map[c - 'a']++;
        return map;
    }
}