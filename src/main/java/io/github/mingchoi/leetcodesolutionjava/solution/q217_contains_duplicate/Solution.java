package io.github.mingchoi.leetcodesolutionjava.solution.q217_contains_duplicate;

import java.util.HashMap;

/*
Runtime: 9 ms, faster than 57.49% of Java online submissions for Contains Duplicate.
Memory Usage: 43.8 MB, less than 65.52% of Java online submissions for Contains Duplicate.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            if (map.get(i) == null) {
                map.put(i, true);
            } else {
                return true;
            }
        }
        return false;
    }
}
