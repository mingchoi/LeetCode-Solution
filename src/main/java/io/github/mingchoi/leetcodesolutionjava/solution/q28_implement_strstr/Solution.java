package io.github.mingchoi.leetcodesolutionjava.solution.q28_implement_strstr;
/*
Runtime: 533 ms, faster than 5.64% of Java online submissions for Implement strStr().
Memory Usage: 37.3 MB, less than 93.13% of Java online submissions for Implement strStr().
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (i + j >= haystack.length()) {
                    break;
                } else if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
