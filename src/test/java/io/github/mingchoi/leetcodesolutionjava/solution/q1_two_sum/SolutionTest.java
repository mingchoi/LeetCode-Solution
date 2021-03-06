package io.github.mingchoi.leetcodesolutionjava.solution.q1_two_sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertArrayEquals(
                expected,
                new Solution().twoSum(nums, target)
        );

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};

        assertArrayEquals(
                expected,
                new Solution().twoSum(nums, target)
        );

    }
}