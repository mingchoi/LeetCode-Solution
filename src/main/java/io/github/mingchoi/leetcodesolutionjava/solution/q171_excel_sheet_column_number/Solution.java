package io.github.mingchoi.leetcodesolutionjava.solution.q171_excel_sheet_column_number;

/*
Runtime: 11 ms, faster than 5.73% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
 */
public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sum += char2int(s.charAt(len - i - 1)) * Math.pow(26, i);
            System.out.println(sum);
        }
        return sum;
    }

    public int char2int(char c) {
        return c - 64;
    }
}
