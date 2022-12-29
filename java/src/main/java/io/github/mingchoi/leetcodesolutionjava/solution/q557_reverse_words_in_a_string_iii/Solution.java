package io.github.mingchoi.leetcodesolutionjava.solution.q557_reverse_words_in_a_string_iii;

/*
Runtime: 4 ms, faster than 83.82% of Java online submissions for Reverse Words in a String III.
Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Reverse Words in a String III.
 */
public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            StringBuilder sbr = new StringBuilder();
            sb.append(sbr.append(str).reverse().toString());
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}