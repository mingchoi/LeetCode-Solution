package io.github.mingchoi.leetcodesolutionjava.solution.q98_validate_binary_search_tree;


import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
Runtime: 5 ms, faster than 7.25% of Java online submissions for Validate Binary Search Tree.
Memory Usage: 39.9 MB, less than 71.16% of Java online submissions for Validate Binary Search Tree.
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValidNode(root, new ArrayList<>(), new ArrayList<>());
    }

    public boolean isValidNode(TreeNode root, ArrayList<Integer> parents, ArrayList<Boolean> isLeft) {
        boolean leftValid = true;
        boolean rightValid = true;
        if (root.left != null) {
            for (int i = 0; i < parents.size(); i++) {
                if (isLeft.get(i)) {
                    if (root.left.val >= parents.get(i)) {
                        leftValid = false;
                    }
                } else {
                    if (root.left.val <= parents.get(i)) {
                        leftValid = false;
                    }
                }
            }
            if (leftValid && root.left.val < root.val) {
                ArrayList<Integer> newList = new ArrayList<>(parents);
                newList.add(root.val);
                ArrayList<Boolean> newDirList = new ArrayList<>(isLeft);
                newDirList.add(true);
                leftValid = isValidNode(root.left, newList, newDirList);
            } else {
                leftValid = false;
            }
        }
        if (root.right != null) {
            for (int i = 0; i < parents.size(); i++) {
                if (isLeft.get(i)) {
                    if (root.right.val >= parents.get(i)) {
                        rightValid = false;
                    }
                } else {
                    if (root.right.val <= parents.get(i)) {
                        rightValid = false;
                    }
                }
            }
            if (rightValid && root.right.val > root.val) {
                ArrayList<Integer> newList = new ArrayList<>(parents);
                newList.add(root.val);
                ArrayList<Boolean> newDirList = new ArrayList<>(isLeft);
                newDirList.add(false);
                rightValid = isValidNode(root.right, newList, newDirList);
            } else {
                rightValid = false;
            }
        }
        return leftValid && rightValid;
    }
}