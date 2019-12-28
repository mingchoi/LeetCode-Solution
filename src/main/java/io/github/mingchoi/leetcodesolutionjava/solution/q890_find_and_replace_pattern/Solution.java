package io.github.mingchoi.leetcodesolutionjava.solution.q890_find_and_replace_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
Runtime: 1 ms, faster than 94.38% of Java online submissions for Find and Replace Pattern.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Find and Replace Pattern.
 */
public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        char[] p = convert(pattern);
        for (String word : words)
            if (match(p, convert(word)))
                list.add(word);
        return list;
    }

    boolean match(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    char[] convert(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        char latest = 0;
        char[] src = s.toCharArray();
        for (int i = 0; i < src.length; i++) {
            if (map.containsKey(src[i])) {
                src[i] = map.get(src[i]);
            } else {
                map.put(src[i], latest);
                src[i] = latest;
                latest += 1;
            }
        }
        return src;
    }
}