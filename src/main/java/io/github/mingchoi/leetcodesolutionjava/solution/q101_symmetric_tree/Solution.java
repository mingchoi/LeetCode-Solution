package io.github.mingchoi.leetcodesolutionjava.solution.q101_symmetric_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.val == b.val &&
                    isMirror(a.left, b.right) &&
                    isMirror(a.right, b.left);
        }
        return false;
    }
}
