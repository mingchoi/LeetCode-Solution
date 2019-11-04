package io.github.mingchoi.leetcodesolutionjava.solution.q128_longest_consecutive_sequence;

import java.util.HashMap;
import java.util.List;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            Integer prevOrder = map.get(nums[i] - 1);
            if (prevOrder != null) {
                int currentOrder = prevOrder + 1;
                map.put(nums[i], currentOrder);
                if (currentOrder > max) max = currentOrder;
            } else {
                map.put(nums[i], 0);
            }
            int next = nums[i] + 1;
            int currentOrder = map.get(nums[i]) + 1;
            while (map.get(next) != null) {
                map.put(next, currentOrder);
                if (currentOrder > max) max = currentOrder;
                next++;
                currentOrder++;
            }
        }
        return max + 1;
    }
}
