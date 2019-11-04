package io.github.mingchoi.leetcodesolutionjava.solution.q350_intersection_of_two_arrays_ii;

import java.util.ArrayList;
import java.util.Arrays;

/*
Runtime: 2 ms, faster than 93.37% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 37.6 MB, less than 51.61% of Java online submissions for Intersection of Two Arrays II.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                list.add(nums1[p1]);
                p1++;
                p2++;
            } else {
                if (nums1[p1] < nums2[p2]) {
                    p1++;
                } else {
                    p2++;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
