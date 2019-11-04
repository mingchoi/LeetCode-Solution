package io.github.mingchoi.leetcodesolutionjava.solution.q378_kth_smallest_element_in_a_sorted_matrix;

import java.util.ArrayList;
import java.util.Collections;
/*
Runtime: 20 ms, faster than 39.29% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
Memory Usage: 44 MB, less than 70.27% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
 */
public class Solution {
    // TODO: rewrite this with pointers
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] r : matrix) {
            for (int i : r) {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list.get(k - 1);
    }
}
