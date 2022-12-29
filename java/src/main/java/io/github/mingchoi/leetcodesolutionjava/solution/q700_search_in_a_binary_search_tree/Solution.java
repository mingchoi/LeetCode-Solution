package io.github.mingchoi.leetcodesolutionjava.solution.q700_search_in_a_binary_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Search in a Binary Search Tree.
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val < val)
                curr = curr.right;
            else if (curr.val > val)
                curr = curr.left;
            else
                return curr;
        }
        return null;
    }
}