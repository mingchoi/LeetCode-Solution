package io.github.mingchoi.leetcodesolutionjava.solution.q120_triangle;

import java.util.Collections;
import java.util.List;

/*
Runtime: 4 ms, faster than 30.93% of Java online submissions for Triangle.
Memory Usage: 36.7 MB, less than 95.92% of Java online submissions for Triangle.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) return 0;
        if (triangle.size() == 1) return triangle.get(0).get(0);
        for (int lv = 1; lv < triangle.size(); lv++) {
            List<Integer> list = triangle.get(lv);
            list.set(0, list.get(0) + triangle.get(lv - 1).get(0));
            int last = list.size() - 1;
            for (int i = 1; i < last; i++) {
                int add = Math.min(triangle.get(lv - 1).get(i - 1), triangle.get(lv - 1).get(i));
                list.set(i, list.get(i) + add);
            }
            list.set(last, list.get(last) + triangle.get(lv - 1).get(last - 1));
        }
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}