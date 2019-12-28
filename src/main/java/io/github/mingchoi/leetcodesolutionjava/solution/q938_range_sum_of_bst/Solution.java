package io.github.mingchoi.leetcodesolutionjava.solution.q938_range_sum_of_bst;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
Memory Usage: 45.2 MB, less than 98.26% of Java online submissions for Range Sum of BST.
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root.val < L)
            return (root.right != null ? rangeSumBST(root.right, L, R) : 0);
        else if (root.val > R)
            return (root.left != null ? rangeSumBST(root.left, L, R) : 0);
        else
            return root.val +
                    (root.right != null ? rangeSumBST(root.right, L, R) : 0) +
                    (root.left != null ? rangeSumBST(root.left, L, R) : 0);
    }
}