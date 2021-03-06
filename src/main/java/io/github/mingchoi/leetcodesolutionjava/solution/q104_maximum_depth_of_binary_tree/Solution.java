package io.github.mingchoi.leetcodesolutionjava.solution.q104_maximum_depth_of_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 39 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return traversal(root, 1);
    }

    int traversal(TreeNode node, int level) {
        int left = 0;
        int right = 0;

        if (node.left != null) {
            left = traversal(node.left, level + 1);
        }
        if (node.right != null) {
            right = traversal(node.right, level + 1);
        }
        return Math.max(level, Math.max(left, right));
    }
}
