package io.github.mingchoi.leetcodesolutionjava.solution.q965_univalued_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Univalued Binary Tree.
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return check(root, root.val);
    }

    public boolean check(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;
        return check(node.left, val) && check(node.right, val);
    }
}