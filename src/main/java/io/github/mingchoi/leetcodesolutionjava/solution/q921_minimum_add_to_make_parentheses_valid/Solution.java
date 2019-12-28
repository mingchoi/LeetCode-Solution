package io.github.mingchoi.leetcodesolutionjava.solution.q921_minimum_add_to_make_parentheses_valid;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Add to Make Parentheses Valid.
Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Minimum Add to Make Parentheses Valid.
 */
public class Solution {
    public int minAddToMakeValid(String S) {
        int sum = 0;
        int open = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') open++;
            if (c == ')') {
                if (open >= 1)
                    open--;
                else
                    sum++;
            }
        }
        return sum + open;
    }
}