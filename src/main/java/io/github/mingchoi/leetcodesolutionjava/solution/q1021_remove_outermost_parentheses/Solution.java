package io.github.mingchoi.leetcodesolutionjava.solution.q1021_remove_outermost_parentheses;

/*
Runtime: 2 ms, faster than 98.15% of Java online submissions for Remove Outermost Parentheses.
Memory Usage: 37.2 MB, less than 93.51% of Java online submissions for Remove Outermost Parentheses.
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                count++;
                if (count != 1) sb.append('(');
            } else {
                count--;
                if (count != 0) sb.append(')');
            }
        }
        return sb.toString();
    }
}