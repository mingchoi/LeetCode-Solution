package io.github.mingchoi.leetcodesolutionjava.solution.q105_construct_binary_tree_from_preorder_and_inorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.Arrays;

/*
Runtime: 8 ms, faster than 45.14% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length);
    }

    public TreeNode build(int[] preorder, int[] inorder, int preHead, int inHead, int size) {
        if (size == 0) return null;
        if (size == 1) return new TreeNode(preorder[preHead]);

        TreeNode root = new TreeNode(preorder[preHead]);
        int index = -1;
        for (int i = inHead; i < inHead + size; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        int leftSize = index - inHead;
        root.left = build(preorder, inorder,
                preHead + 1,
                inHead,
                leftSize);
        root.right = build(preorder, inorder,
                preHead + leftSize + 1,
                inHead + leftSize + 1,
                size - leftSize - 1);
        return root;
    }

    public TreeNode buildTree_slow(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        if (preorder.length == 1) return new TreeNode(preorder[0]);
        TreeNode root = new TreeNode(preorder[0]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = buildTree_slow(
                Arrays.copyOfRange(preorder, 1, index + 1),
                Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree_slow(
                Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return root;
    }
}