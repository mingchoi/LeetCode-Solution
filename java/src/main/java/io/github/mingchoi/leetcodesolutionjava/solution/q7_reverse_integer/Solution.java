package io.github.mingchoi.leetcodesolutionjava.solution.q7_reverse_integer;

/*
Runtime: 2 ms, faster than 24.62% of Java online submissions for Reverse Integer.
Memory Usage: 33.9 MB, less than 9.44% of Java online submissions for Reverse Integer.
 */
class Solution {
    public long reverse(long x) {
        String str = String.valueOf(x);
        boolean nev = x < 0;

        StringBuilder sb;
        if (nev) {
            str = str.substring(1);
            sb = new StringBuilder("-");
        } else {
            sb = new StringBuilder();
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        long result = Long.parseLong(sb.toString());
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
    }
}