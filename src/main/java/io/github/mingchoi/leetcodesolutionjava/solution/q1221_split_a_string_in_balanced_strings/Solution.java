package io.github.mingchoi.leetcodesolutionjava.solution.q1221_split_a_string_in_balanced_strings;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
Memory Usage: 33.8 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int bal = 0;
        for (char c : s.toCharArray()) {
            bal = c == 'L' ? bal + 1 : bal - 1;
            if (bal == 0) {
                sum++;
                bal = 0;
            }
        }
        return sum;
    }
}