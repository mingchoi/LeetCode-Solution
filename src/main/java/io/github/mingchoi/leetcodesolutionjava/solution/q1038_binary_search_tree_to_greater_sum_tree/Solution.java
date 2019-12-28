package io.github.mingchoi.leetcodesolutionjava.solution.q1038_binary_search_tree_to_greater_sum_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
Memory Usage: 34 MB, less than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
 */
public class Solution {
    public TreeNode bstToGst(TreeNode root) {
        update(root);
        return root;
    }

    int sum = 0;

    void update(TreeNode node) {
        if (node.right != null) {
            update(node.right);
        }

        sum += node.val;
        node.val = sum;

        if (node.left != null) {
            update(node.left);
        }
    }
}