package io.github.mingchoi.leetcodesolutionjava.solution.q103_binary_tree_zigzag_level_order_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.ArrayList;
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
Runtime: 1 ms, faster than 92.68% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
Memory Usage: 36.3 MB, less than 99.04% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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

        if (level % 2 == 0) {
            list.get(level).add(node.val);
        } else {
            list.get(level).add(0, node.val);
        }

        if (node.left != null) {
            traversal(node.left, list, level + 1);
        }
        if (node.right != null) {
            traversal(node.right, list, level + 1);
        }
    }
}
