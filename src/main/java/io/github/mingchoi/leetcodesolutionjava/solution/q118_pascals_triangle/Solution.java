package io.github.mingchoi.leetcodesolutionjava.solution.q118_pascals_triangle;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(1);
            if (i > 1) {
                List<Integer> last = triangle.get(i - 1);
                for (int j = 0; j < i - 1; j++) {
                    list.set(j + 1, last.get(j) + last.get(j + 1));
                }
            }
            triangle.add(new ArrayList<>(list));
        }
        return triangle;
    }
}
