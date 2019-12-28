package io.github.mingchoi.leetcodesolutionjava.solution.q22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;
/*
Runtime: 1 ms, faster than 94.68% of Java online submissions for Generate Parentheses.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Generate Parentheses.
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        fn(result, n, 0, "");
        return result;
    }

    private void fn(List<String> result, int remainAdd, int remainRemove, String str) {
        if (remainAdd == 0 && remainRemove == 0) {
            result.add(str);
            return;
        }
        if (remainAdd > 0) {
            fn(result, remainAdd - 1, remainRemove + 1, str + "(");
        }
        if (remainRemove > 0) {
            fn(result, remainAdd, remainRemove - 1, str + ")");
        }
    }
}
