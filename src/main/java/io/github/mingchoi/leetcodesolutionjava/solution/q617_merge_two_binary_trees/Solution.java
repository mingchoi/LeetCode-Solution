package io.github.mingchoi.leetcodesolutionjava.solution.q617_merge_two_binary_trees;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
Memory Usage: 40 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            if (t2 == null) {
                return null;
            } else {
                return t2;
            }
        } else if (t2 == null) {
            return t1;
        } else {
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        }
    }
}