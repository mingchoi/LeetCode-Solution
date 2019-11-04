package io.github.mingchoi.leetcodesolutionjava.solution.q7_reverse_integer;

class Solution {
    public int reverse(int x) {
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

        return Integer.parseInt(sb.toString());
    }
}