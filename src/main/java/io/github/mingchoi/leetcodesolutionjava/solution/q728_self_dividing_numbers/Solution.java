package io.github.mingchoi.leetcodesolutionjava.solution.q728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;
/*
Runtime: 2 ms, faster than 73.44% of Java online submissions for Self Dividing Numbers.
Memory Usage: 33.9 MB, less than 30.00% of Java online submissions for Self Dividing Numbers.
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        loop:
        for (int n = left; n <= right; n++) {
            int d = n;
            while (d != 0) {
                int v = d % 10;
                if (v == 0 || n % v != 0) continue loop;
                d = d / 10;
            }
            list.add(n);
        }
        return list;
    }
}