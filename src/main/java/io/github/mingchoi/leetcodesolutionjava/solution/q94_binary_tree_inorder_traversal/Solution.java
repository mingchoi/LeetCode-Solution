package io.github.mingchoi.leetcodesolutionjava.solution.q94_binary_tree_inorder_traversal;

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
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        traversal(root, list);
        return list;
    }

    void traversal(TreeNode root, ArrayList<Integer> list){
        if(root.left != null){
            traversal(root.left, list);
        }
        list.add(root.val);
        if(root.right != null){
            traversal(root.right, list);
        }
    }
}
