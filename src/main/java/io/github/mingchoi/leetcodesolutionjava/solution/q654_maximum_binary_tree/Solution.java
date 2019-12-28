package io.github.mingchoi.leetcodesolutionjava.solution.q654_maximum_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Binary Tree.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Maximum Binary Tree.
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return handle(nums, 0, nums.length - 1);
    }

    TreeNode handle(int[] nums, int head, int tail) {
        if (head == tail) return new TreeNode(nums[head]);
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = head; i <= tail; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode node = new TreeNode(max);
        if (maxIndex > head) {
            node.left = handle(nums, head, maxIndex - 1);
        }
        if (maxIndex < tail) {
            node.right = handle(nums, maxIndex + 1, tail);
        }
        return node;
    }
}