package io.github.mingchoi.leetcodesolutionjava.solution.q20_valid_parentheses;

import java.util.Stack;
/*
Runtime: 1 ms, faster than 98.86% of Java online submissions for Valid Parentheses.
Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Valid Parentheses.
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
