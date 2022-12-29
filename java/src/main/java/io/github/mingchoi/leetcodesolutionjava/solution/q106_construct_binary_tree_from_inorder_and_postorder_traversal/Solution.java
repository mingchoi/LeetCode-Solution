package io.github.mingchoi.leetcodesolutionjava.solution.q106_construct_binary_tree_from_inorder_and_postorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.Arrays;

/*
Runtime: 6 ms, faster than 38.33% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder, inorder, 0, 0, inorder.length);
    }

    public TreeNode build(int[] postorder, int[] inorder, int postHead, int inHead, int size) {
        if (size == 0) return null;
        if (size == 1) return new TreeNode(postorder[postHead + size - 1]);

        TreeNode root = new TreeNode(postorder[postHead + size - 1]);
        int index = -1;
        for (int i = inHead; i < inHead + size; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        int leftSize = index - inHead;
        root.left = build(postorder, inorder,
                postHead,
                inHead,
                leftSize);
        root.right = build(postorder, inorder,
                postHead + leftSize,
                inHead + leftSize + 1,
                size - leftSize - 1);
        return root;
    }

    public TreeNode buildTree_slow(int[] inorder, int[] postorder) {
        if (postorder.length == 0) return null;
        if (postorder.length == 1) return new TreeNode(postorder[postorder.length - 1]);
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = buildTree_slow(
                Arrays.copyOfRange(inorder, 0, index),
                Arrays.copyOfRange(postorder, 0, index)
        );
        root.right = buildTree_slow(
                Arrays.copyOfRange(inorder, index + 1, inorder.length),
                Arrays.copyOfRange(postorder, index, postorder.length - 1)
        );
        return root;
    }
}