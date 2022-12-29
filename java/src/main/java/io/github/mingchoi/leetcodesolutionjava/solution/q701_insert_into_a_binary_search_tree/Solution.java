package io.github.mingchoi.leetcodesolutionjava.solution.q701_insert_into_a_binary_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr = root;
        while (true) {
            if (val < curr.val) {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    break;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    break;
                } else {
                    curr = curr.right;
                }
            }
        }
        return root;
    }
}