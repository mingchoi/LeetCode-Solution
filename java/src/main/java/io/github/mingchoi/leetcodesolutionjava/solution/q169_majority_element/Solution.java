package io.github.mingchoi.leetcodesolutionjava.solution.q169_majority_element;

import java.util.HashMap;
/*
Runtime: 9 ms, faster than 46.06% of Java online submissions for Majority Element.
Memory Usage: 39.9 MB, less than 99.26% of Java online submissions for Majority Element.
 */
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer exist = map.get(nums[i]);
            if (exist == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], exist + 1);
            }
        }
        int max = 0;
        int maxNum = 0;
        for (Integer k : map.keySet()) {
            int v = map.get(k);
            if (v > max) {
                max = v;
                maxNum = k;
            }
        }
        return maxNum;
    }
}