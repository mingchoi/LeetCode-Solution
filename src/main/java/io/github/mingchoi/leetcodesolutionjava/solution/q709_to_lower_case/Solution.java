package io.github.mingchoi.leetcodesolutionjava.solution.q709_to_lower_case;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
Memory Usage: 34.1 MB, less than 98.70% of Java online submissions for To Lower Case.
 */
public class Solution {
    public String toLowerCase(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c > '@' && c < 'a') c += 32;
            result += c;
        }
        return result;
    }
}