package io.github.mingchoi.leetcodesolutionjava.solution.q108_convert_sorted_array_to_binary_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Runtime: 1 ms, faster than 12.22% of Java online submissions for Convert Sorted Array to Binary Search Tree.
Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        int rootIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, rootIndex));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, rootIndex + 1, nums.length));
        return root;
    }
}
