package io.github.mingchoi.leetcodesolutionjava.solution.q814_binary_tree_pruning;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Binary Tree Pruning.
 */
public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) return null;
        return root;
    }
}