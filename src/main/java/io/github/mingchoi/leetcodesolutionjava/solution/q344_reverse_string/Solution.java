package io.github.mingchoi.leetcodesolutionjava.solution.q344_reverse_string;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
Memory Usage: 51.2 MB, less than 66.27% of Java online submissions for Reverse String.
 */
public class Solution {
    public void reverseString(char[] s) {
        int len = (int) Math.ceil(s.length / 2.0);
        for (int i = 0; i < len; i++) {
            int t = s.length - i - 1;
            char tmp = s[t];
            s[t] = s[i];
            s[i] = tmp;
        }
    }
}