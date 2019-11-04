package io.github.mingchoi.leetcodesolutionjava.solution.q140_word_break_ii;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    HashMap<String, Boolean> failed = new HashMap<>();
    int longest = 0;
    List<List<String>> combo = new ArrayList<>();

    // TODO: Time limit
    public List<String> wordBreak(String s, List<String> wordDict) {
        for (String str : wordDict) {
            map.put(str, true);
            if (str.length() > longest) longest = str.length();
        }
        match(s, new ArrayList<>());

        List<String> result = new ArrayList<>();
        for (List<String> list : combo) {
            result.add(String.join(" ", list));
        }
        return result;
    }

    void match(String s, ArrayList<String> words) {
        int limit = Math.min(longest, s.length());
        String hash = s.substring(0, limit);
        if (failed.get(hash) != null) return;
        if (s.length() == 0) {
            combo.add(words);
            return;
        }
        boolean found = false;
        for (int i = 1; i <= limit; i++) {
            String trim = s.substring(0, i);
            if (map.get(trim) != null) {
                ArrayList<String> newline = new ArrayList<>(words);
                newline.add(trim);
                match(s.substring(i), newline);
                found = true;
            }
        }
        if (found == false) failed.put(hash, true);
    }
}
