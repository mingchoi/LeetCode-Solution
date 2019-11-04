package io.github.mingchoi.leetcodesolutionjava.solution.q349_intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.HashMap;

/*
Runtime: 3 ms, faster than 37.05% of Java online submissions for Intersection of Two Arrays.
Memory Usage: 37.5 MB, less than 67.57% of Java online submissions for Intersection of Two Arrays.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums1) map.put(i, false);
        for (int i : nums2) {
            if (map.containsKey(i)) {
                map.put(i, true);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int k : map.keySet()) {
            if (map.get(k) == true) list.add(k);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) result[i] = list.get(i);
        return result;
    }
}