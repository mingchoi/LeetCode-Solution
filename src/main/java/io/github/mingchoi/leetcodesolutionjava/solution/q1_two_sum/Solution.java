package io.github.mingchoi.leetcodesolutionjava.solution.q1_two_sum;

import java.util.HashMap;

/*
Runtime: 2 ms, faster than 98.93% of Java online submissions for Two Sum.
Memory Usage: 38.1 MB, less than 95.67% of Java online submissions for Two Sum.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{
                        map.get(target - nums[i]),
                        i
                };
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum_bruceforce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}