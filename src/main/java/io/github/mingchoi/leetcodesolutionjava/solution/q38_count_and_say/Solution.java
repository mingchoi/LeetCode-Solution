package io.github.mingchoi.leetcodesolutionjava.solution.q38_count_and_say;

/*
Runtime: 7 ms, faster than 29.42% of Java online submissions for Count and Say.
Memory Usage: 36.4 MB, less than 52.63% of Java online submissions for Count and Say.
 */
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 0; i < n - 1; i++) {
            str = fn(str);
        }
        return str;
    }

    private String fn(String str) {
        Character last = null;
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (last == null) {
                last = c;
                count = 1;

            } else if (c == last) {
                count++;
            } else {
                result += String.valueOf(count) + last;
                last = c;
                count = 1;
            }
        }
        return result + String.valueOf(count) + last;
    }
}
