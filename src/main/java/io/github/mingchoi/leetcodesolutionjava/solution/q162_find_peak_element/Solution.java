package io.github.mingchoi.leetcodesolutionjava.solution.q162_find_peak_element;

enum Direction {up, flat, down}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Peak Element.
Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Find Peak Element.
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        Direction last = check(nums[nums.length - 1], nums[0]);
        for (int i = 0; i < nums.length; i++) {
            Direction next = check(nums[i], nums[i + 1 == nums.length ? 0 : i + 1]);
            if (last == Direction.up && next == Direction.down) {
                return i;
            }
            last = next;
        }
        return 0;
    }

    public Direction check(int last, int cur) {
        if (last == cur) {
            return Direction.flat;
        } else if (last < cur) {
            return Direction.up;
        } else {
            return Direction.down;
        }
    }
}
