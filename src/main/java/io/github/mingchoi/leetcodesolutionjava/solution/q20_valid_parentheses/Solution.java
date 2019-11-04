package io.github.mingchoi.leetcodesolutionjava.solution.q20_valid_parentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            }
        }
        return true;
    }
}
