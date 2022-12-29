package io.github.mingchoi.leetcodesolutionjava.solution.q1008_construct_binary_search_tree_from_preorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
 */
public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            TreeNode curr = root;
            while (true) {
                if (preorder[i] < curr.val) {
                    if (curr.left == null) {
                        curr.left = new TreeNode(preorder[i]);
                        break;
                    } else {
                        curr = curr.left;
                    }
                } else {
                    if (curr.right == null) {
                        curr.right = new TreeNode(preorder[i]);
                        break;
                    } else {
                        curr = curr.right;
                    }
                }
            }
        }
        return root;
    }
}