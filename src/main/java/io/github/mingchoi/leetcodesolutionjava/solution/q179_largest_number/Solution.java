package io.github.mingchoi.leetcodesolutionjava.solution.q179_largest_number;

import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : nums) list.add(String.valueOf(i));

        // TODO: not working
        Collections.sort(list, (o1, o2) -> {
            int i = 0;
            while (true) {
                if (i < o1.length() && i < o2.length()) {
                    int n1 = Integer.parseInt(String.valueOf(o1.charAt(i)));
                    int n2 = Integer.parseInt(String.valueOf(o2.charAt(i)));
                    if (n1 == n2) {
                        i++;
                    } else if (n1 > n2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (i < o1.length()) {
                    int n1 = Integer.parseInt(String.valueOf(o1.charAt(i)));
                    int n2 = Integer.parseInt(String.valueOf(o2.charAt(i - 1)));
                    if (n1 > n2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (i < o2.length()) {
                    int n1 = Integer.parseInt(String.valueOf(o1.charAt(i - 1)));
                    int n2 = Integer.parseInt(String.valueOf(o2.charAt(i)));
                    if (n1 < n2) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return 0;
                }
            }
        });

        String r = "";
        for (String s : list) {
            if (r.equals("") && s.equals("0")) {
                continue;
            }
            r += s;
        }
        if (r.equals("")) return "0";
        return r;
    }
}
