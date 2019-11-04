package io.github.mingchoi.leetcodesolutionjava.solution.q384_shuffle_an_array;

import java.util.Collections;
import java.util.Stack;

/*
Runtime: 142 ms, faster than 9.71% of Java online submissions for Shuffle an Array.
Memory Usage: 61.3 MB, less than 61.29% of Java online submissions for Shuffle an Array.
 */
public class Solution {

    private int[] origin;

    public Solution(int[] nums) {
        origin = nums;
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        Stack<Integer> remain = new Stack<>();
        for (int i : origin) remain.add(i);
        Collections.shuffle(remain);

        int[] result = new int[origin.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = remain.pop();
        }
        return result;
    }
}
