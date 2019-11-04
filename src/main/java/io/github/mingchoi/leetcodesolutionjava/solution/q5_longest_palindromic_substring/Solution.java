package io.github.mingchoi.leetcodesolutionjava.solution.q5_longest_palindromic_substring;

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int len = s.length();
        int goal = len / 2;
        while (i <= goal) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (true) {
            int len = end - start + 1;

            if (len < 3) {
                String str = s.substring(start, end + 1);
                if (isPalindrome(str)) {
                    return str;
                }
                return String.valueOf(s.charAt(0));
            }

            if (s.charAt(start) == s.charAt(end)) {
                String str = s.substring(start, end + 1);
                if (isPalindrome(str)) {
                    return str;
                }
                start++;
                end--;
            } else if (s.charAt(start) == s.charAt(end - 1)) {
                end--;
            } else if (s.charAt(start + 1) == s.charAt(end)) {
                start++;
            } else {
                start++;
                end--;
            }

        }
    }
}
