package io.github.mingchoi.leetcodesolutionjava.solution.q1047_remove_all_adjacent_duplicates_in_string;

/*
Runtime: 14 ms, faster than 71.81% of Java online submissions for Remove All Adjacent Duplicates In String.
Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
 */
public class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        int len = -1;
        while (len != sb.length()) {
            len = sb.length();
            int pt = 0;
            while (pt < sb.length() - 1) {
                if (sb.charAt(pt) == sb.charAt(pt + 1)) {
                    sb.deleteCharAt(pt);
                    sb.deleteCharAt(pt);
                } else {
                    pt++;
                }
            }
        }
        return sb.toString();
    }
}