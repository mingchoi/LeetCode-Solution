package io.github.mingchoi.leetcodesolutionjava.solution.q14_longest_common_prefix;
/*
Runtime: 1 ms, faster than 74.39% of Java online submissions for Longest Common Prefix.
Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Longest Common Prefix.
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }


        int goal = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < goal) {
                goal = s.length();
            }
        }

        int index = 0;
        while (index < goal) {
            boolean common = true;
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(index) != c) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }

        return strs[0].substring(0, index);
    }
}
