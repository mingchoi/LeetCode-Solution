package io.github.mingchoi.leetcodesolutionjava.solution.q804_unique_morse_code_words;

import java.util.HashSet;
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Unique Morse Code Words.
Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> map = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(codes[word.charAt(i) - 'a']);
            }
            map.add(sb.toString());
        }
        return map.size();
    }
}