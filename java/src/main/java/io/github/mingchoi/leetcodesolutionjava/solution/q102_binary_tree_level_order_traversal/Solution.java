package io.github.mingchoi.leetcodesolutionjava.solution.q102_binary_tree_level_order_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        traversal(root, list, 0);
        return list;
    }

    public void traversal(TreeNode node, List<List<Integer>> list, int level) {
        if (list.size() < level + 1) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(node.val);

        if (node.left != null) {
            traversal(node.left, list, level + 1);
        }
        if (node.right != null) {
            traversal(node.right, list, level + 1);
        }
    }
}
