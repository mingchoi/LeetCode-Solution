package io.github.mingchoi.leetcodesolutionjava.solution.q287_find_the_duplicate_number;

import java.util.HashMap;
import java.util.HashSet;

/*
Runtime: 4 ms, faster than 27.12% of Java online submissions for Find the Duplicate Number.
Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Find the Duplicate Number.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int last = 0;
        while (true) {
            int curr = nums[last];
            System.out.println(nums[last] + ":" + nums[curr]);
            if (nums[last] == nums[curr]) {
                return nums[last];
            }
            last = curr;
        }
    }

    public int findDuplicate_hashmap(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i : nums) {
            if (map.contains(i)) return i;
            map.add(i);
        }
        return -1;
    }
}