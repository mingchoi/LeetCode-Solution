package io.github.mingchoi.leetcodesolutionjava.solution.q139_word_break;

import java.util.HashMap;
import java.util.List;
/*
Runtime: 1 ms, faster than 99.58% of Java online submissions for Word Break.
Memory Usage: 35.6 MB, less than 99.28% of Java online submissions for Word Break.
 */
class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    HashMap<String, Boolean> failed = new HashMap<>();
    int longest = 0;

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String str : wordDict) {
            map.put(str, true);
            if (str.length() > longest) longest = str.length();
        }
        return match(s);
    }

    boolean match(String s) {
        int limit = Math.min(longest, s.length());
        String hash = s.substring(0, limit);
        if (failed.get(hash) != null) return false;
        if (s.length() == 0) return true;
        for (int i = 1; i <= limit; i++) {
            String trim = s.substring(0, i);
            if (map.get(trim) != null) {
                boolean r = match(s.substring(i));
                if (r == true) {
                    return true;
                }
            }
        }
        failed.put(hash, true);
        return false;
    }
}
