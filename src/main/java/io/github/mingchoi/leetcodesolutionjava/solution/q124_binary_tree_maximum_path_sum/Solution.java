package io.github.mingchoi.leetcodesolutionjava.solution.q124_binary_tree_maximum_path_sum;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 1 ms, faster than 99.80% of Java online submissions for Binary Tree Maximum Path Sum.
Memory Usage: 40 MB, less than 98.81% of Java online submissions for Binary Tree Maximum Path Sum.
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};
        dp(root, max);
        return max[0];
    }

    public int dp(TreeNode root, int[] max) {
        int left = root.left != null ? dp(root.left, max) : 0;
        int right = root.right != null ? dp(root.right, max) : 0;

        // connect left & current & right
        max[0] = Math.max(max[0], root.val + left + right);

        // max with current node or path
        int pass = Math.max(
                root.val,
                root.val + Math.max(left, right)
        );
        max[0] = Math.max(max[0], pass);
        return pass;
    }
}
