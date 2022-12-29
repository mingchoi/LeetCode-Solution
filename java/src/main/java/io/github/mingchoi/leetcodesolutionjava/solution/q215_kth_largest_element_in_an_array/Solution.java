package io.github.mingchoi.leetcodesolutionjava.solution.q215_kth_largest_element_in_an_array;

import java.util.ArrayList;
import java.util.Collections;

/*
Runtime: 7 ms, faster than 53.27% of Java online submissions for Kth Largest Element in an Array.
Memory Usage: 38 MB, less than 52.33% of Java online submissions for Kth Largest Element in an Array.
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k - 1);
    }
}