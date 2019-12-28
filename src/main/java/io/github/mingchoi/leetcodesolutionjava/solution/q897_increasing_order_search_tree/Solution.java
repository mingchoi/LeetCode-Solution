package io.github.mingchoi.leetcodesolutionjava.solution.q897_increasing_order_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/*
Runtime: 2 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
Memory Usage: 43.8 MB, less than 43.75% of Java online submissions for Increasing Order Search Tree.
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = new TreeNode(0);
        clone(root, head);
        return head.right;
    }

    void clone(TreeNode node, TreeNode r) {
        if (node.left != null) clone(node.left, r);
        while (r.right != null) r = r.right;
        r.right = new TreeNode(node.val);
        r = r.right;
        if (node.right != null) clone(node.right, r);
    }
}