package io.github.mingchoi.leetcodesolutionjava.solution.q28_implement_strstr;

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
