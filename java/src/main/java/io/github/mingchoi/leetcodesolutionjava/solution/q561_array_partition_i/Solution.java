package io.github.mingchoi.leetcodesolutionjava.solution.q561_array_partition_i;

import java.util.Arrays;

/*
Runtime: 14 ms, faster than 92.74% of Java online submissions for Array Partition I.
Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Array Partition I.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}