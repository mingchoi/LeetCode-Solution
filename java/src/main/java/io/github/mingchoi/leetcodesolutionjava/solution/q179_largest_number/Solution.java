package io.github.mingchoi.leetcodesolutionjava.solution.q179_largest_number;

import java.util.*;

/*
Runtime: 5 ms, faster than 47.12% of Java online submissions for Largest Number.
Memory Usage: 36.2 MB, less than 82.22% of Java online submissions for Largest Number.
 */
public class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : nums) list.add(String.valueOf(i));
        list.sort((a, b) -> (b + a).compareTo(a + b));
        if (list.get(0).equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : list) sb.append(s);
        return sb.toString();
    }
}
