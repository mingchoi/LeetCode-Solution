package io.github.mingchoi.leetcodesolutionjava.solution.q236_lowest_common_ancestor_of_a_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/*
Runtime: 6 ms, faster than 77.68% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
Memory Usage: 34.3 MB, less than 9.52% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if (root.val == p.val) return p;
        if (root.val == q.val) return q;

        System.out.println("R:" + root.val + " L:" + (l != null ? l.val : " ") + " R:" + (r != null ? r.val : " "));

        TreeNode match = null;
        if (l != null) {
            if (l.val == p.val) match = p;
            else if (l.val == q.val) match = q;
            else return l;
        }
        if (r != null) {
            if (r.val == p.val) {
                if (match != null) return root;
                match = p;
            } else if (r.val == q.val) {
                if (match != null) return root;
                match = q;
            } else {
                return r;
            }
        }
        return match;
    }
}