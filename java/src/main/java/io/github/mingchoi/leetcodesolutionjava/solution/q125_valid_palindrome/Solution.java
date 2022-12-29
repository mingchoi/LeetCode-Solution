package io.github.mingchoi.leetcodesolutionjava.solution.q125_valid_palindrome;
/*
Runtime: 5 ms, faster than 56.06% of Java online submissions for Valid Palindrome.
Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Valid Palindrome.
 */
class Solution {
    public boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        while (lo < hi) {
            Character a = s.charAt(lo);
            Character b = s.charAt(hi);
            if (!Character.isAlphabetic(a) && !Character.isDigit(a)) {
                lo++;
                continue;
            }
            if (!Character.isAlphabetic(b) && !Character.isDigit(b)) {
                hi--;
                continue;
            }
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            } else {
                lo++;
                hi--;
            }
        }
        return true;
    }
}
